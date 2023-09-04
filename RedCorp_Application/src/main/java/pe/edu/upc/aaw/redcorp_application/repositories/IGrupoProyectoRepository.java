package pe.edu.upc.aaw.alvaroavance1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.alvaroavance1.entities.GrupoProyecto;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IGrupoProyectoRepository extends JpaRepository<GrupoProyecto, Integer> {
    List<GrupoProyecto>findByCreationDateGP(LocalDate creationDateGP);
}