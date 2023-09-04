package pe.edu.upc.aaw.alvaroavance1.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Comunicado")
public class Comunicado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int comunicado_id;
    @Column(name = "Titulo",length = 45,nullable = false)
    private String titulo;
    @Column(name = "Contenido",length = 50,nullable = false)
    private String contenido;
    @Column(name = "Fecha_Creacion",nullable = false)
    private LocalDate creationFechaComunicado;
    @ManyToOne
    @JoinColumn(name = "GrupoDeProyecto_id")
    private GrupoProyecto grupoProyecto;

/*
    @ManyToOne
    @JoinColumn(name = "Usuario_id")
    private Usuario u;

    @ManyToOne
    @JoinColumn(name = "AreaDeTrabajo_id")
    private AreaDeTrabajo at;
*/

    public Comunicado() {}

    public Comunicado(int comunicado_id, String titulo, String contenido, LocalDate creationFechaComunicado, GrupoProyecto grupoProyecto) {
        this.comunicado_id = comunicado_id;
        this.titulo = titulo;
        this.contenido = contenido;
        this.creationFechaComunicado = creationFechaComunicado;
        this.grupoProyecto = grupoProyecto;
    }

    public int getComunicado_id() {
        return comunicado_id;
    }

    public void setComunicado_id(int comunicado_id) {
        this.comunicado_id = comunicado_id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDate getCreationFechaComunicado() {
        return creationFechaComunicado;
    }

    public void setCreationFechaComunicado(LocalDate creationFechaComunicado) {
        this.creationFechaComunicado = creationFechaComunicado;
    }

    public GrupoProyecto getGrupoProyecto() {
        return grupoProyecto;
    }

    public void setGrupoProyecto(GrupoProyecto grupoProyecto) {
        this.grupoProyecto = grupoProyecto;
    }
}
