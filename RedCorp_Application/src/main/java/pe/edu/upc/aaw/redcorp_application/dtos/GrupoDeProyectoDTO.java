package pe.edu.upc.aaw.redcorp_application.dtos;

import javax.persistence.Column;
import java.time.LocalDate;

public class GrupoDeProyectoDTO {
    private int idGrupoDeProyecto;
    private String nombre;
    private LocalDate fechaCreacion;

    public GrupoDeProyectoDTO() {
    }

    public GrupoDeProyectoDTO(int idGrupoDeProyecto, String nombre, LocalDate fechaCreacion) {
        this.idGrupoDeProyecto = idGrupoDeProyecto;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
    }

    public int getIdGrupoDeProyecto() {
        return idGrupoDeProyecto;
    }

    public void setIdGrupoDeProyecto(int idGrupoDeProyecto) {
        this.idGrupoDeProyecto = idGrupoDeProyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
