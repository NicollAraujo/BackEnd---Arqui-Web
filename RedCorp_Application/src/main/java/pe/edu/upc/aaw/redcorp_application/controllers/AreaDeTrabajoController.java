package pe.edu.upc.aaw.redcorp_application.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.redcorp_application.dtos.AreaDeTrabajoDTO;
import pe.edu.upc.aaw.redcorp_application.dtos.UsuarioAreaDeTrabajoDTO;
import pe.edu.upc.aaw.redcorp_application.entities.AreaDeTrabajo;
import pe.edu.upc.aaw.redcorp_application.serviceinterfaces.IAreaDeTrabajoService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/areasdetrabajo")
public class AreaDeTrabajoController {
    @Autowired
    private IAreaDeTrabajoService iA;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void registrar(@RequestBody AreaDeTrabajoDTO dto) {
        ModelMapper m = new ModelMapper();
        AreaDeTrabajo a = m.map(dto, AreaDeTrabajo.class);
        iA.insert(a);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<AreaDeTrabajoDTO> listar() {
        return iA.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, AreaDeTrabajoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") Integer id) {
        iA.delete(id);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public AreaDeTrabajoDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        AreaDeTrabajoDTO dto = m.map(iA.listId(id), AreaDeTrabajoDTO.class);
        return dto;
    }

    @GetMapping("/AreasUser/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<UsuarioAreaDeTrabajoDTO> mostrarAreasDeTrabajoUsuario(@PathVariable("id") int id) {
        List<Object[]> lista = iA.userAreasOfWork(id);
        List<UsuarioAreaDeTrabajoDTO> listaAreas = new ArrayList<>();
        for (Object[] data : lista) {
            UsuarioAreaDeTrabajoDTO dto = new UsuarioAreaDeTrabajoDTO();
            dto.setIdAreaDeTrabajo((int) data[0]);
            dto.setNombreAreaTrabajo((String) data[1]);
            listaAreas.add(dto);
        }
        return listaAreas;
    }
}
