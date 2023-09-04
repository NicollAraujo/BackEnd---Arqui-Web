package pe.edu.upc.aaw.alvaroavance1.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.alvaroavance1.entities.Comunicado;
import pe.edu.upc.aaw.alvaroavance1.repositories.IComunicadoRepository;
import pe.edu.upc.aaw.alvaroavance1.serviceinterfaces.IComunicadoService;

import java.util.List;

@Service
public class ComunicadoServiceImplement implements IComunicadoService {
    @Autowired
    private IComunicadoRepository cR;
    @Override
    public void insert(Comunicado comunicado) {
        cR.save(comunicado);
    }
    @Override
    public List<Comunicado> list() {
        return cR.findAll();
    }
}
