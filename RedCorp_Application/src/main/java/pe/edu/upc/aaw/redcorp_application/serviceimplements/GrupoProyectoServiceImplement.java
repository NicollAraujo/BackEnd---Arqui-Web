package pe.edu.upc.aaw.alvaroavance1.serviceImplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.alvaroavance1.entities.GrupoProyecto;
import pe.edu.upc.aaw.alvaroavance1.repositories.IGrupoProyectoRepository;
import pe.edu.upc.aaw.alvaroavance1.serviceinterfaces.IGrupoProyectoService;

import java.time.LocalDate;
import java.util.List;

@Service
public class GrupoProyectoServiceImplement implements IGrupoProyectoService {
    @Autowired
    private IGrupoProyectoRepository gpR;

    @Override
    public void insert(GrupoProyecto grupoProyecto){
        gpR.save(grupoProyecto);
    }
    @Override
    public List<GrupoProyecto> list(){
        return gpR.findAll();
    }
    @Override
    public void delete(int idGP) {
        gpR.deleteById(idGP);
    }
    @Override
    public GrupoProyecto listId(int idGP) {
        return gpR.findById(idGP).orElse(new GrupoProyecto());
    }
    @Override
    public List<GrupoProyecto> findByCreationDateGP(LocalDate creationDateGP) {
        return gpR.findByCreationDateGP(creationDateGP);
    }
}
