package pe.edu.upc.aaw.redcorp_application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.redcorp_application.entities.TareaMiembroArea;

import java.util.List;

@Repository
public interface ITareaMiembroAreaRepository extends JpaRepository<TareaMiembroArea,Integer> {
    @Query(value = "SELECT t.id_tarea,t.nombre,t.descripcion \n" +
            "FROM Tarea t\n" +
            "inner join tarea_miembro_area ar on ar.tarea_id = t.id_tarea\n" +
            "inner join miembro_de_area ma on ma.id_miembro_de_area=ar.miembro_de_area_id\n" +
            "where ma.id_miembro_de_area=:idmiembro",nativeQuery = true)
    public List<String[]> taskmember(@Param("idmiembro") int idmiembro);
}
