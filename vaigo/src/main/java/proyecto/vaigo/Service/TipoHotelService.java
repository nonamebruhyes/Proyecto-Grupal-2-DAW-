package proyecto.vaigo.Service;

import proyecto.vaigo.model.dto.TipoHotelDTO;


import java.util.List;

public interface TipoHotelService {
    List<TipoHotelDTO> findAll();
    TipoHotelDTO findById(TipoHotelDTO tipoHotelDTO);
}
