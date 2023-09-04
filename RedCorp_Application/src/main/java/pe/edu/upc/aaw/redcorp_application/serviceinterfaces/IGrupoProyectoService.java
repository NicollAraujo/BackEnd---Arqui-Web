package pe.edu.upc.aaw.alvaroavance1.serviceinterfaces;

import pe.edu.upc.aaw.alvaroavance1.entities.GrupoProyecto;

import java.time.LocalDate;
import java.util.List;

public interface IGrupoProyectoService {
    public void insert(GrupoProyecto grupoProyecto);
    public List<GrupoProyecto> list();
    public void delete(int idGP);
    public GrupoProyecto listId(int idGP);
    List<GrupoProyecto>findByCreationDateGP(LocalDate creationDateGP);

}
