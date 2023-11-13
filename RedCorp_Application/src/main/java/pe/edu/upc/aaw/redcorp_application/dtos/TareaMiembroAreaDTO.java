package pe.edu.upc.aaw.redcorp_application.dtos;
import pe.edu.upc.aaw.redcorp_application.entities.MiembroDeArea;
import pe.edu.upc.aaw.redcorp_application.entities.Tarea;
import pe.edu.upc.aaw.redcorp_application.entities.TareaMiembroArea;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class TareaMiembroAreaDTO {
    private  int idTareaMiembroArea;
    private MiembroDeArea miembroDeArea;
    private Tarea tarea;
    private Boolean active;


    public TareaMiembroAreaDTO() {
    }

    public TareaMiembroAreaDTO(int idTareaMiembroArea, MiembroDeArea miembroDeArea, Tarea tarea, Boolean active) {
        this.idTareaMiembroArea = idTareaMiembroArea;
        this.miembroDeArea = miembroDeArea;
        this.tarea = tarea;
        this.active = active;
    }

    public int getIdTareaMiembroArea() {
        return idTareaMiembroArea;
    }

    public void setIdTareaMiembroArea(int idTareaMiembroArea) {
        this.idTareaMiembroArea = idTareaMiembroArea;
    }

    public MiembroDeArea getMiembroDeArea() {
        return miembroDeArea;
    }

    public void setMiembroDeArea(MiembroDeArea miembroDeArea) {
        this.miembroDeArea = miembroDeArea;
    }

    public Tarea getTarea() {
        return tarea;
    }

    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
