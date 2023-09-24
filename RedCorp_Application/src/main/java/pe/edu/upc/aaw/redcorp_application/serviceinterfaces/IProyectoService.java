package pe.edu.upc.aaw.redcorp_application.serviceinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.aaw.redcorp_application.entities.Proyecto;

import java.util.List;

public interface IProyectoService {
    public void insert(Proyecto proyecto);
    public List<Proyecto> list();

    public void delete(int idProyecto );

    public Proyecto listId(int idProyecto);

    public List<String[]> userDetailsProyect( int idProyecto);


}
