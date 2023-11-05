package pe.edu.upc.aaw.redcorp_application.dtos;

public class PanelUserAreaDTO {
    private String nombre;
    private String correo;
    private String area;



    public PanelUserAreaDTO() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
