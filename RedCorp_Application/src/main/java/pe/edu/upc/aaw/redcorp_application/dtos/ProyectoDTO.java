package pe.edu.upc.aaw.redcorp_application.dtos;

import pe.edu.upc.aaw.redcorp_application.entities.Usuario;

import javax.persistence.*;
import java.time.LocalDate;

public class ProyectoDTO {
    private int idProyecto;
    private String nombre;
    private String descripcion;
    private Usuario usuario;
    private LocalDate fechaCreacion;
    private Boolean active;

    public ProyectoDTO() {
    }

    public ProyectoDTO(int idProyecto, String nombre, String descripcion, Usuario usuario, LocalDate fechaCreacion, Boolean active) {
        this.idProyecto = idProyecto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.usuario = usuario;
        this.fechaCreacion = fechaCreacion;
        this.active = active;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
