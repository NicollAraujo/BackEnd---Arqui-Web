package pe.edu.upc.aaw.redcorp_application.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.redcorp_application.dtos.MiembroDeAreaDTO;
import pe.edu.upc.aaw.redcorp_application.dtos.MiembroEnGrupoDTO;
import pe.edu.upc.aaw.redcorp_application.entities.MiembroDeArea;
import pe.edu.upc.aaw.redcorp_application.entities.MiembroEnGrupo;
import pe.edu.upc.aaw.redcorp_application.serviceinterfaces.IMiembroEnGrupoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/miembroEnGrupo")
public class MiembroEnGrupoController {
    @Autowired
    private IMiembroEnGrupoService iM;
    @PostMapping
    public void registrar(@RequestBody MiembroEnGrupoDTO dto){
        ModelMapper m=new ModelMapper();
        MiembroEnGrupo mi=m.map(dto,MiembroEnGrupo.class);
        iM.insert(mi);
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void modificar(@RequestBody MiembroEnGrupoDTO dto) {
        ModelMapper m = new ModelMapper();
        MiembroEnGrupo t = m.map(dto, MiembroEnGrupo.class);
        iM.insert(t);
    }
    @GetMapping
    public  List<MiembroEnGrupoDTO>listar(){
     return iM.list().stream().map(x->{
         ModelMapper m=new ModelMapper();
         return  m.map(x,MiembroEnGrupoDTO.class);
     }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        iM.delete(id);
    }
    @GetMapping("/{id}")
    public  MiembroEnGrupoDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        MiembroEnGrupoDTO dto=m.map(iM.listId(id),MiembroEnGrupoDTO.class);
        return  dto;
    }
}
