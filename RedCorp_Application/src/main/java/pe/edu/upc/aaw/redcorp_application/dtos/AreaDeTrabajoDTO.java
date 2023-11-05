package pe.edu.upc.aaw.redcorp_application.dtos;

public class AreaDeTrabajoDTO {
    private int idAreaDeTrabajo;
    private String nombre;
    private String descripcion;
    private Boolean active;

    public AreaDeTrabajoDTO() {
    }

    public AreaDeTrabajoDTO(int idAreaDeTrabajo, String nombre, String descripcion, Boolean active) {
        this.idAreaDeTrabajo = idAreaDeTrabajo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.active = active;
    }

    public int getIdAreaDeTrabajo() {
        return idAreaDeTrabajo;
    }

    public void setIdAreaDeTrabajo(int idAreaDeTrabajo) {
        this.idAreaDeTrabajo = idAreaDeTrabajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
