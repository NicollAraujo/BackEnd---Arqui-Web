package pe.edu.upc.aaw.redcorp_application.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.redcorp_application.dtos.AreaDeTrabajoDTO;
import pe.edu.upc.aaw.redcorp_application.dtos.GrupoDeProyectoDTO;
import pe.edu.upc.aaw.redcorp_application.dtos.ProyectoDTO;
import pe.edu.upc.aaw.redcorp_application.entities.AreaDeTrabajo;
import pe.edu.upc.aaw.redcorp_application.entities.GrupoDeProyecto;
import pe.edu.upc.aaw.redcorp_application.entities.Proyecto;
import pe.edu.upc.aaw.redcorp_application.serviceinterfaces.IGrupoDeProyectoService;
import pe.edu.upc.aaw.redcorp_application.serviceinterfaces.IProyectoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/grupo-de-proyectos")
public class GrupoDeProyectoController {

    @Autowired
    private IGrupoDeProyectoService iG;
    @PostMapping
    public void registrar(@RequestBody GrupoDeProyectoDTO dto)
    {
        ModelMapper m = new ModelMapper();
        GrupoDeProyecto p = m.map(dto,GrupoDeProyecto.class);
        iG.insert(p);
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void modificar(@RequestBody GrupoDeProyectoDTO dto) {
        ModelMapper m = new ModelMapper();
        GrupoDeProyecto t = m.map(dto, GrupoDeProyecto.class);
        iG.insert(t);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('EMPLO')")
    public List<GrupoDeProyectoDTO> listar()
    {
        return iG.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,GrupoDeProyectoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        iG.delete(id);
    }

    @GetMapping("/{id}")
    public GrupoDeProyectoDTO listarId(@PathVariable("id") Integer id)
    {
        ModelMapper m = new ModelMapper();

        GrupoDeProyectoDTO dto = m.map(iG.listId(id),GrupoDeProyectoDTO.class);
        return dto;
    }
}
