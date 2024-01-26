package proyecto.vaigo.Service;

import proyecto.vaigo.model.dto.ExcursionDTO;
import proyecto.vaigo.model.dto.TransporteDTO;

import java.util.List;

public interface TransporteService {
    List<TransporteDTO> findAll();
}
