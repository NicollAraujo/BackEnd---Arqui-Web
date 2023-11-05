package pe.edu.upc.aaw.redcorp_application.dtos;

public class MiembrosTareasDTO {
    public int idTarea;
    public String nombre;
    public String descripcion;
    private Boolean active;

    public MiembrosTareasDTO() {
    }

    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
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
}
