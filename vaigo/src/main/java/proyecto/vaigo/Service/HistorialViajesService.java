package proyecto.vaigo.Service;





import proyecto.vaigo.model.dto.HistorialViajesDTO;

import java.util.List;

public interface HistorialViajesService {
    List<HistorialViajesDTO> findAll();
     HistorialViajesDTO findById(HistorialViajesDTO historialViajesDTO);
}
