package pe.edu.upc.aaw.redcorp_application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.redcorp_application.entities.Proyecto;

import java.util.List;

@Repository
public interface IProyectoRepository extends JpaRepository<Proyecto,Integer> {
    @Query(value = "SELECT u.nombre, pr.nombre AS nombreProyecto, r.descripcion, pr.idProyecto\n" +
            "FROM Usuario u\n" +
            "INNER JOIN Rol r ON u.rol.idRol = r.idRol\n" +
            "INNER JOIN Proyecto pr ON pr.usuario.idUsuario = u.idUsuario\n" +
            "WHERE u.rol.idRol = 1 AND pr.idProyecto :idProyecto",nativeQuery = true)
    public List<String[]> userProyectsDescription(@Param("idProyecto") int idProyecto);
}
