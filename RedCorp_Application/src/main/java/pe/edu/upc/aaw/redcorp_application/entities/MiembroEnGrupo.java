package pe.edu.upc.aaw.redcorp_application.entities;

import javax.persistence.*;

@Entity
@Table(name = "MiembroEnGrupo")
public class MiembroEnGrupo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idMiembroEnGrupo;
    @ManyToOne
    @JoinColumn(name = "miembroDeArea")
    MiembroDeArea miembroDeArea;
    @ManyToOne
    @JoinColumn(name = "grupoDeProyectoId")
    GrupoDeProyecto grupoDeProyecto;
    @Column(name = "active",nullable = false)
    private Boolean active;
    public MiembroEnGrupo() {
    }

    public MiembroEnGrupo(int idMiembroEnGrupo, MiembroDeArea miembroDeArea, GrupoDeProyecto grupoDeProyecto, Boolean active) {
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
