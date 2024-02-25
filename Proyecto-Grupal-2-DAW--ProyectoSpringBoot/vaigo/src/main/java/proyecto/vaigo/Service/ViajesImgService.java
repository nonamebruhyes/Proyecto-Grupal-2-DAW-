package proyecto.vaigo.Service;


import proyecto.vaigo.model.dto.ViajesimagenesDTO;

import java.util.List;

public interface ViajesImgService {
    List<ViajesimagenesDTO> findAll();
    ViajesimagenesDTO findById(ViajesimagenesDTO viajesimagenesDTO);
    ViajesimagenesDTO findByIdVia(ViajesimagenesDTO viajesimagenesDTO);
    ViajesimagenesDTO findByIdVia(int idViaje);

}
