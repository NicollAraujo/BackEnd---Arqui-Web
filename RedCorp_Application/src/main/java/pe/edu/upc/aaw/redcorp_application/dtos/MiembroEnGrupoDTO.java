package pe.edu.upc.aaw.redcorp_application.dtos;

import pe.edu.upc.aaw.redcorp_application.entities.GrupoDeProyecto;
import pe.edu.upc.aaw.redcorp_application.entities.MiembroDeArea;

public class MiembroEnGrupoDTO {
        private  int idMiembroEnGrupo;
        private MiembroDeArea miembroDeArea;
        private GrupoDeProyecto grupoDeProyecto;
        private Boolean active;

        public MiembroEnGrupoDTO() {
        }

    public MiembroEnGrupoDTO(int idMiembroEnGrupo, MiembroDeArea miembroDeArea, GrupoDeProyecto grupoDeProyecto, Boolean active) {
        this.idMiembroEnGrupo = idMiembroEnGrupo;
        this.miembroDeArea = miembroDeArea;
        this.grupoDeProyecto = grupoDeProyecto;
        this.active = active;
    }

    public int getIdMiembroEnGrupo() {
        return idMiembroEnGrupo;
    }

    public void setIdMiembroEnGrupo(int idMiembroEnGrupo) {
        this.idMiembroEnGrupo = idMiembroEnGrupo;
    }

    public MiembroDeArea getMiembroDeArea() {
        return miembroDeArea;
    }

    public void setMiembroDeArea(MiembroDeArea miembroDeArea) {
        this.miembroDeArea = miembroDeArea;
    }

    public GrupoDeProyecto getGrupoDeProyecto() {
        return grupoDeProyecto;
    }

    public void setGrupoDeProyecto(GrupoDeProyecto grupoDeProyecto) {
        this.grupoDeProyecto = grupoDeProyecto;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
