package pe.edu.upc.aaw.alvaroavance1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.alvaroavance1.entities.Comunicado;

@Repository
public interface IComunicadoRepository extends JpaRepository<Comunicado, Integer> {}
