package pe.edu.upc.aaw.redcorp_application.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.redcorp_application.dtos.AreaDeTrabajoDTO;
import pe.edu.upc.aaw.redcorp_application.dtos.ComunicadoDTO;
import pe.edu.upc.aaw.redcorp_application.dtos.ComunicadosGrupodeProyectoDTO;
import pe.edu.upc.aaw.redcorp_application.dtos.ProyectoDTO;
import pe.edu.upc.aaw.redcorp_application.entities.AreaDeTrabajo;
import pe.edu.upc.aaw.redcorp_application.entities.Comunicado;
import pe.edu.upc.aaw.redcorp_application.entities.Proyecto;
import pe.edu.upc.aaw.redcorp_application.serviceinterfaces.IComunicadoService;
import pe.edu.upc.aaw.redcorp_application.serviceinterfaces.IProyectoService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comunicados")
public class ComunicadoController {
    @Autowired
    private IComunicadoService iC;
    @PostMapping
    public void registrar(@RequestBody ComunicadoDTO dto)
    {
        ModelMapper m = new ModelMapper();
        Comunicado p = m.map(dto,Comunicado.class);
        iC.insert(p);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<ComunicadoDTO> listar()
    {
        return iC.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,ComunicadoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        iC.delete(id);
    }

    @GetMapping("/{id}")
    public ComunicadoDTO listarId(@PathVariable("id") Integer id)
    {
        ModelMapper m = new ModelMapper();

        ComunicadoDTO dto = m.map(iC.listId(id),ComunicadoDTO.class);
        return dto;
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void modificar(@RequestBody ComunicadoDTO dto) {
        ModelMapper m = new ModelMapper();
        Comunicado t = m.map(dto, Comunicado.class);
        iC.insert(t);
    }

    @GetMapping("/cantidadGP")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<ComunicadosGrupodeProyectoDTO> cantidadComunicadosporGrupodeProyecto() {
        List<String[]> lista = iC.CantidaddeComunicadosporGrupos();
        List<ComunicadosGrupodeProyectoDTO> listaDTO = new ArrayList<>();
        for (String[] data : lista) {
            ComunicadosGrupodeProyectoDTO dto = new ComunicadosGrupodeProyectoDTO();
            dto.setNombregp(data[0]);
            dto.setCantidadComunicados(Integer.parseInt(data[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}
