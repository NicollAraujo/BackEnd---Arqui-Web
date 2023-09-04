package pe.edu.upc.aaw.alvaroavance1.dtos;

import java.time.LocalDate;
public class GrupoProyectoDTO {
    private int GrupoProyecto_id;
    private String nombre;
    private LocalDate creationDateGP;

    public int getGrupoProyecto_id() {
        return GrupoProyecto_id;
    }

    public void setGrupoProyecto_id(int grupoProyecto_id) {
        GrupoProyecto_id = grupoProyecto_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getCreationDateGP() {
        return creationDateGP;
    }

    public void setCreationDateGP(LocalDate creationDateGP) {
        this.creationDateGP = creationDateGP;
    }
}
