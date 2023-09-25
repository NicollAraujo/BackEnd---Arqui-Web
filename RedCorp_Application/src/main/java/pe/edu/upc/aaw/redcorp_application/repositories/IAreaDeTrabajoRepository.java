package pe.edu.upc.aaw.redcorp_application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.redcorp_application.entities.AreaDeTrabajo;

import java.util.List;

@Repository
public interface IAreaDeTrabajoRepository extends JpaRepository<AreaDeTrabajo,Integer> {
    @Query(value = "SELECT aT.nombre as nombre_area_trabajo " +
            "FROM AreaDeTrabajo aT " +
            "INNER JOIN MiembroDeArea mA ON a.id = mA.AreaDeTrabajo_id " +
            "INNER JOIN Usuario u ON mA.Usuario_id = u.id " +
            "WHERE u.id = :idUsuario", nativeQuery = true)
    public List<String> userAreasOfWork(@Param("idUsuario") int idUsuario);
//ver a que areas de trabajo pertenece un usuario
}
