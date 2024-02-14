package proyecto.vaigo.Service;

import proyecto.vaigo.model.dto.ViajesDTO;

import java.util.List;

public interface ViajesService {
    List<ViajesDTO> findAll();
    ViajesDTO findById(ViajesDTO viajesDTO);
    List<ViajesDTO> findFiltro();
}
