package pe.edu.upc.aaw.alvaroavance1.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.edu.upc.aaw.alvaroavance1.dtos.ComunicadoDTO;
import pe.edu.upc.aaw.alvaroavance1.entities.Comunicado;
import pe.edu.upc.aaw.alvaroavance1.serviceinterfaces.IComunicadoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comunicados")
public class ComunicadoController {
    @Autowired
    private IComunicadoService cS;

    @PostMapping
    public void registrar(@RequestBody ComunicadoDTO dto){
        ModelMapper m = new ModelMapper();
        Comunicado c = m.map(dto, Comunicado.class);
        cS.insert(c);
    }

    @GetMapping
    public List<ComunicadoDTO> listar(){
        return cS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ComunicadoDTO.class);
        }).collect(Collectors.toList());
    }
}
