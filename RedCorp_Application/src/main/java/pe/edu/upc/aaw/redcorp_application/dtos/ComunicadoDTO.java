package pe.edu.upc.aaw.alvaroavance1.dtos;

import pe.edu.upc.aaw.alvaroavance1.entities.GrupoProyecto;

import java.time.LocalDate;
public class ComunicadoDTO {
    private int comunicado_id;
    private String titulo;
    private String contenido;
    private LocalDate creationFechaComunicado;
    private GrupoProyecto grupoProyecto;

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
