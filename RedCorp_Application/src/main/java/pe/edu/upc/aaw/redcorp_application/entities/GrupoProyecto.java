package pe.edu.upc.aaw.alvaroavance1.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "GrupoDeProyecto")
public class GrupoProyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int GrupoProyecto_id;
    @Column(name = "Nombre",length = 45,nullable = false)
    private String nombre;
    @Column(name = "Fecha_Creacion",nullable = false)
    private LocalDate creationDateGP;

    public GrupoProyecto() {}

    public GrupoProyecto(int grupoProyecto_id, String nombre, LocalDate creationDateGP) {
        GrupoProyecto_id = grupoProyecto_id;
        this.nombre = nombre;
        this.creationDateGP = creationDateGP;
    }

    public int getGrupoProyecto_id() {
        return GrupoProyecto_id;
    }

    public void setGrupoProyecto_id(int grupoProyecto_id) {
        GrupoProyecto_id = grupoProyecto_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getCreationDateGP() {
        return creationDateGP;
    }

    public void setCreationDateGP(LocalDate creationDateGP) {
        this.creationDateGP = creationDateGP;
    }
}


