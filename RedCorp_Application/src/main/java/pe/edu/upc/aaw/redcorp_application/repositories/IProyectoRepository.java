package pe.edu.upc.aaw.redcorp_application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.redcorp_application.entities.Proyecto;

import java.util.List;

@Repository
public interface IProyectoRepository extends JpaRepository<Proyecto,Integer> {
    @Query(value = "SELECT u.nombre,pr.nombre as nombre_proyecto,r.descripcion,pr.id_proyecto FROM usuario u \n" +
            " inner join rol r\n" +
            " on u.rol_id = r.id_rol\n" +
            " inner join proyecto pr\n" +
            " on pr.usuario_id = u.id_usuario\n" +
            " where u.rol_id = 1 and pr.id_proyecto=:idProyecto",nativeQuery = true)
    public List<String[]> userProyectsDescription(@Param("idProyecto") int idProyecto);



}
