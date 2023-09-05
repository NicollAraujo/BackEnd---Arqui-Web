package pe.edu.upc.aaw.redcorp_application.dtos;
import pe.edu.upc.aaw.redcorp_application.entities.MiembroDeArea;
import pe.edu.upc.aaw.redcorp_application.entities.TareaMiembroArea;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class TareaMiembroAreaDTO {
    private  int idTareaMiembroArea;
    private MiembroDeArea miembroDeArea;
    private TareaMiembroArea tareaMiembroArea;

    public TareaMiembroAreaDTO(){}
    public TareaMiembroAreaDTO(int idTareaMiembroArea, MiembroDeArea miembroDeArea,TareaMiembroArea tareaMiembroArea){
        this.idTareaMiembroArea=idTareaMiembroArea;
        this.miembroDeArea=miembroDeArea;
        this.tareaMiembroArea=tareaMiembroArea;
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

    public TareaMiembroArea getTareaMiembroArea() {
        return tareaMiembroArea;
    }

    public void setTareaMiembroArea(TareaMiembroArea tareaMiembroArea) {
        this.tareaMiembroArea = tareaMiembroArea;
    }
}
