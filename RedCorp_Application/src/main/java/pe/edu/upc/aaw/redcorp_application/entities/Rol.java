package pe.edu.upc.aaw.redcorp_application.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idRol;
    @Column(name = "descripcion",length = 50,nullable = false)
    private String descripcion;
    @Column(name = "active",nullable = false)
    private Boolean active;



    public Rol() {
    }

    public Rol(int idRol, String descripcion, Boolean active) {
        this.idRol = idRol;
        this.descripcion = descripcion;
        this.active = active;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
