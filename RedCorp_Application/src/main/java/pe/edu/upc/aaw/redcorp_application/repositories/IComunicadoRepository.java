package pe.edu.upc.aaw.redcorp_application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.upc.aaw.redcorp_application.entities.Comunicado;

import java.util.List;

public interface IComunicadoRepository extends JpaRepository<Comunicado,Integer> {
    @Query(value = "SELECT g.nombre, COUNT(c.id_comunicado)\n" +
            "\n" +
            "FROM grupo_de_proyecto g INNER JOIN comunicado c\n" +
            "\n" +
            "ON g.id_grupo_de_proyecto = c.grupo_de_proyecto_id\n" +
            "\n" +
            "GROUP BY g.nombre",nativeQuery = true)
    public List<String[]> CantidaddeComunicadosporGrupos();
}
