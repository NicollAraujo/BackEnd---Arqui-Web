package pe.edu.upc.aaw.redcorp_application.entities;

import javax.persistence.*;

@Entity
@Table(name = "Comentario")
public class Comentario {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private  int idComentario;
    @Column(name = "comentario",length = 100,nullable = false)
    private String comentario;
    @Column(name = "active",nullable = false)
    private Boolean active;
    @ManyToOne
    @JoinColumn(name = "tareaId")
    Tarea tarea;

    public Comentario() {
    }

    public Comentario(int idComentario, String comentario, Boolean active, Tarea tarea) {
        this.idComentario = idComentario;
        this.comentario = comentario;
        this.active = active;
        this.tarea = tarea;
    }

    public int getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Tarea getTarea() {
        return tarea;
    }

    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }
}
