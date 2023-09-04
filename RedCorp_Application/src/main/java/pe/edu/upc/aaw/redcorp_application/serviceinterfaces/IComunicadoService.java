package pe.edu.upc.aaw.alvaroavance1.serviceinterfaces;

import pe.edu.upc.aaw.alvaroavance1.entities.Comunicado;

import java.util.List;
public interface IComunicadoService {
    public void insert(Comunicado comunicado);
    public List<Comunicado> list();
}
