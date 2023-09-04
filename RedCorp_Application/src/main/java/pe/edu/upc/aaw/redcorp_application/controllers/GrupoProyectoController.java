package pe.edu.upc.aaw.alvaroavance1.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.edu.upc.aaw.alvaroavance1.dtos.GrupoProyectoDTO;
import pe.edu.upc.aaw.alvaroavance1.entities.GrupoProyecto;
import pe.edu.upc.aaw.alvaroavance1.serviceinterfaces.IGrupoProyectoService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/proyectos")
public class GrupoProyectoController {
    @Autowired
    private IGrupoProyectoService gpS;

    @PostMapping
    public void registrar(@RequestBody GrupoProyectoDTO gpdto) {
        ModelMapper m = new ModelMapper();
        GrupoProyecto gp = m.map(gpdto, GrupoProyecto.class);
        gpS.insert(gp);
    }

    @GetMapping
    public List<GrupoProyectoDTO> listar() {
        return gpS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, GrupoProyectoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        gpS.delete(id);
    }

    @GetMapping("/{id}")
    public GrupoProyectoDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        GrupoProyectoDTO gpdto = m.map(gpS.listId(id),GrupoProyectoDTO.class);
        return gpdto;
    }
    @PostMapping("/buscargp")
    public List<GrupoProyectoDTO> buscar(@RequestBody LocalDate fechagp) {
        return gpS.findByCreationDateGP(fechagp).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, GrupoProyectoDTO.class);
        }).collect(Collectors.toList());
    }
}
