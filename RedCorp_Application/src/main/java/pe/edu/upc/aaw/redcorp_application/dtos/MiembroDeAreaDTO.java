package pe.edu.upc.aaw.redcorp_application.dtos;

public class MiembroDeAreaDTO {
    private int idMiembroDeArea;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private String cargo;
    private String areaDeTrabajo;

    public MiembroDeAreaDTO() {
    }

    public MiembroDeAreaDTO(int idMiembroDeArea, String nombre, String apellido, String correo, String telefono, String cargo, String areaDeTrabajo) {
        this.idMiembroDeArea = idMiembroDeArea;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.cargo = cargo;
        this.areaDeTrabajo = areaDeTrabajo;
    }

    public int getIdMiembroDeArea() {
        return idMiembroDeArea;
    }

    public void setIdMiembroDeArea(int idMiembroDeArea) {
        this.idMiembroDeArea = idMiembroDeArea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreMiembroDeArea) {
        this.nombre = nombreMiembroDeArea;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellidoMiembroDeArea) {
        this.apellido = apellidoMiembroDeArea;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correoMiembroDeArea) {
        this.correo = correoMiembroDeArea;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefonoMiembroDeArea) {
        this.telefono = telefonoMiembroDeArea;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargoMiembroDeArea) {
        this.cargo = cargoMiembroDeArea;
    }

    public String getAreaDeTrabajo() {
        return areaDeTrabajo;
    }

    public void setAreaDeTrabajo(String areaDeTrabajoMiembroDeArea) {
        this.areaDeTrabajo = areaDeTrabajoMiembroDeArea;
    }
}
