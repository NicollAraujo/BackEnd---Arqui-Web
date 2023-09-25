package pe.edu.upc.aaw.redcorp_application.dtos;

import org.springframework.data.repository.query.Param;

import java.util.List;

public class UsuarioAreaDeTrabajoDTO {

    public Long idUsuario;
    public int idAreaDeTrabajo;
    public String nombreAreaTrabajo;

    public UsuarioAreaDeTrabajoDTO() {
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdAreaDeTrabajo() {
        return idAreaDeTrabajo;
    }

    public void setIdAreaDeTrabajo(int idAreaDeTrabajo) {
        this.idAreaDeTrabajo = idAreaDeTrabajo;
    }

    public String getNombreAreaTrabajo() {
        return nombreAreaTrabajo;
    }

    public void setNombreAreaTrabajo(String nombreAreaTrabajo) {
        this.nombreAreaTrabajo = nombreAreaTrabajo;
    }
}