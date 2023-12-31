package pe.edu.upc.aaw.redcorp_application.dtos;

import org.springframework.data.repository.query.Param;

import java.util.List;

public class UsuarioAreaDeTrabajoDTO {

    public int idAreaDeTrabajo;
    public String nombreAreaTrabajo;
    private Boolean active;

    public UsuarioAreaDeTrabajoDTO() {
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