package pe.edu.upc.aaw.redcorp_application.dtos;

import pe.edu.upc.aaw.redcorp_application.entities.AreaDeTrabajo;
import pe.edu.upc.aaw.redcorp_application.entities.Usuario;

public class MiembroDeAreaDTO {
    private int idMiembroDeArea;
    private Usuario usuario;
    private AreaDeTrabajo areaDeTrabajo;
    private Boolean active;

    public MiembroDeAreaDTO() {
    }

    public MiembroDeAreaDTO(int idMiembroDeArea, Usuario usuario, AreaDeTrabajo areaDeTrabajo, Boolean active) {
        this.idMiembroDeArea = idMiembroDeArea;
        this.usuario = usuario;
        this.areaDeTrabajo = areaDeTrabajo;
        this.active = active;
    }

    public int getIdMiembroDeArea() {
        return idMiembroDeArea;
    }

    public void setIdMiembroDeArea(int idMiembroDeArea) {
        this.idMiembroDeArea = idMiembroDeArea;
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

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
