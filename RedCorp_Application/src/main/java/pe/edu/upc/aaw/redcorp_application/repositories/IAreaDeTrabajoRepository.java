package pe.edu.upc.aaw.redcorp_application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.redcorp_application.entities.AreaDeTrabajo;

import java.util.List;

@Repository
public interface IAreaDeTrabajoRepository extends JpaRepository<AreaDeTrabajo,Integer> {

//ver a que areas de trabajo pertenece un usuario
@Query(value = "SELECT A.id_area_de_trabajo AS id_AreaDeTrabajo, A.nombre AS Nombre_AreaDeTrabajo " +
        "FROM area_de_trabajo A " +
        "JOIN miembro_de_area Ma ON A.id_area_de_trabajo = Ma.area_de_trabajo_id " +
        "WHERE Ma.usuario_id = :id_usuario", nativeQuery = true)
    public List<String[]> userAreasOfWork(@Param("id_usuario") int idUsuario);

}
