package pe.edu.upc.aaw.redcorp_application.serviceinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.aaw.redcorp_application.entities.TareaMiembroArea;

import java.util.List;

public interface ITareaMiembroAreaService {
    void insert(TareaMiembroArea tareaMiembroArea);

    List<TareaMiembroArea> list();

    void delete(int idTareaMiembroArea);

    TareaMiembroArea listId(int idTareaMiembroArea);
    public List<String[]> memberstask(@Param("idmiembro") int idmiembro);
}
