package pe.edu.upc.aaw.redcorp_application.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.redcorp_application.dtos.MiembrosTareasDTO;
import pe.edu.upc.aaw.redcorp_application.dtos.RolDTO;
import pe.edu.upc.aaw.redcorp_application.dtos.TareaMiembroAreaDTO;
import pe.edu.upc.aaw.redcorp_application.entities.Rol;
import pe.edu.upc.aaw.redcorp_application.entities.TareaMiembroArea;
import pe.edu.upc.aaw.redcorp_application.serviceinterfaces.ITareaMiembroAreaService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/tareaMiembroArea")
public class TareaMiembroAreaController {
    @Autowired
    private ITareaMiembroAreaService iT;
    @PostMapping
    public void registrar(@RequestBody TareaMiembroAreaDTO dto){
        ModelMapper m=new ModelMapper();
        TareaMiembroArea t=m.map(dto,TareaMiembroArea.class);
        iT.insert(t);
    }
    @GetMapping()
    public List<TareaMiembroAreaDTO>listar(){
        return  iT.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,TareaMiembroAreaDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public  void eliminar(@PathVariable("id")Integer id){
        iT.delete(id);
    }
    @GetMapping("/{id}")
    public TareaMiembroAreaDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        TareaMiembroAreaDTO dto=m.map(iT.listId(id),TareaMiembroAreaDTO.class);
        return  dto;
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void modificar(@RequestBody TareaMiembroAreaDTO dto) {
        ModelMapper m = new ModelMapper();
        TareaMiembroArea t = m.map(dto, TareaMiembroArea.class);
        iT.insert(t);
    }
    @GetMapping("/taskmember/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<MiembrosTareasDTO> mostrarTareasMiembros(@PathVariable("id") int id) {
        List<String[]> lista = iT.memberstask(id);
        List<MiembrosTareasDTO> listamiembros = new ArrayList<>();
        for (String[] data:lista)
        {
            MiembrosTareasDTO dto = new MiembrosTareasDTO();
            dto.setIdTarea(Integer.parseInt(data[0]));
            dto.setNombre(data[1]);
            dto.setDescripcion(data[2]);
            listamiembros.add(dto);

        }
        return listamiembros;
    }
}
