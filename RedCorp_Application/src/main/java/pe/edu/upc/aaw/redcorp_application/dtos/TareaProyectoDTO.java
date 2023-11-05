package pe.edu.upc.aaw.redcorp_application.dtos;

public class TareaProyectoDTO {

    private String descripcionTarea;
    private String nombreProyecto;
    private Boolean active;

    public String getDescripcionTarea() {
        return descripcionTarea;
    }

    public void setDescripcionTarea(String descripcionTarea) {
        this.descripcionTarea = descripcionTarea;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }
}
