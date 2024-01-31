package proyecto.vaigo.Service;

import proyecto.vaigo.model.dto.ExcursionDTO;
import proyecto.vaigo.model.dto.UsuariosDTO;

import java.util.List;

public interface UsuariosService {
    List<UsuariosDTO> findAll();
    UsuariosDTO findById(UsuariosDTO usuariosDTO);
}
