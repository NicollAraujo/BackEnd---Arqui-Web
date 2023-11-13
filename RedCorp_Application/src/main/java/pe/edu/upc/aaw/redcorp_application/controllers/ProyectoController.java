package pe.edu.upc.aaw.redcorp_application.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.redcorp_application.dtos.MiembroEnGrupoDTO;
import pe.edu.upc.aaw.redcorp_application.dtos.ProyectoDTO;
import pe.edu.upc.aaw.redcorp_application.dtos.UsuarioProyectoDTO;
import pe.edu.upc.aaw.redcorp_application.entities.MiembroEnGrupo;
import pe.edu.upc.aaw.redcorp_application.entities.Proyecto;
import pe.edu.upc.aaw.redcorp_application.serviceinterfaces.IProyectoService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/proyectos")
public class ProyectoController {
    @Autowired
    private IProyectoService iP;
    @PostMapping

    public void registrar(@RequestBody ProyectoDTO dto)
    {
        ModelMapper m = new ModelMapper();
        Proyecto p = m.map(dto,Proyecto.class);
        iP.insert(p);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('EMPLO')")
    public List<ProyectoDTO> listar()
    {
        return iP.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,ProyectoDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void modificar(@RequestBody ProyectoDTO dto) {
        ModelMapper m = new ModelMapper();
        Proyecto t = m.map(dto, Proyecto.class);
        iP.insert(t);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        iP.delete(id);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('EMPLO')")
    public ProyectoDTO listarId(@PathVariable("id") Integer id)
    {
        ModelMapper m = new ModelMapper();

        ProyectoDTO dto = m.map(iP.listId(id),ProyectoDTO.class);
        return dto;
    }

    @GetMapping("/userProyect/{id}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('EMPLO')")
    public List<UsuarioProyectoDTO> mostrarUsuarioProyecto(@PathVariable("id") int id) {
        List<String[]> lista = iP.userDetailsProyect(id);
        List<UsuarioProyectoDTO> listaUsuarios = new ArrayList<>();
        for (String[] data:lista)
        {
            UsuarioProyectoDTO dto = new UsuarioProyectoDTO();
            dto.setNombreUsuario(data[0]);
            dto.setNombreProyecto(data[1]);
            dto.setRolUsuario(data[2]);
            dto.setIdProyecto(Integer.parseInt(data[3]));
            dto.setFechaCreacion(LocalDate.parse(data[4]));
            listaUsuarios.add(dto);

        }
        return listaUsuarios;
    }







}
