package pe.edu.upc.aaw.redcorp_application.dtos;

import pe.edu.upc.aaw.redcorp_application.entities.AreaDeTrabajo;
import pe.edu.upc.aaw.redcorp_application.entities.GrupoDeProyecto;
import pe.edu.upc.aaw.redcorp_application.entities.Usuario;

import javax.persistence.*;
import java.time.LocalDate;

public class ComunicadoDTO {
    private  int idComunicado;
    private String titulo;
    private String descripcion;
    private LocalDate fechaCreacion;

    private Boolean active;
    Usuario usuario;
    AreaDeTrabajo areaDeTrabajo;
    GrupoDeProyecto grupoDeProyecto;

    public ComunicadoDTO() {
    }

    public int getIdComunicado() {
        return idComunicado;
    }

    public void setIdComunicado(int idComunicado) {
        this.idComunicado = idComunicado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public AreaDeTrabajo getAreaDeTrabajo() {
        return areaDeTrabajo;
    }

    public void setAreaDeTrabajo(AreaDeTrabajo areaDeTrabajo) {
        this.areaDeTrabajo = areaDeTrabajo;
    }

    public GrupoDeProyecto getGrupoDeProyecto() {
        return grupoDeProyecto;
    }

    public void setGrupoDeProyecto(GrupoDeProyecto grupoDeProyecto) {
        this.grupoDeProyecto = grupoDeProyecto;
    }
}
