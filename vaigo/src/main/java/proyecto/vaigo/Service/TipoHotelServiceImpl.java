package proyecto.vaigo.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.vaigo.model.dto.TipoHotelDTO;
import proyecto.vaigo.model.entity.TipohotelEntity;
import proyecto.vaigo.repository.TipoHotelRepository;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TipoHotelServiceImpl implements TipoHotelService {
    private static final Logger log = LoggerFactory.getLogger(ItinerarioServiceImpl.class);

    @Autowired
    private TipoHotelRepository tipoHotelRepository;

    @Override
    public List<TipoHotelDTO> findAll() {
        log.info("ClienteServiceImpl - findAll: Lista de todos los cliente");
        List<TipoHotelDTO> listaTipoHotelDTO = tipoHotelRepository.findAll()
                .stream()
                .map(p -> TipoHotelDTO.convertToDTO(p))
                .collect(Collectors.toList());

        return listaTipoHotelDTO;
    }
    @Override
    public TipoHotelDTO findById(TipoHotelDTO tipoHotelDTO) {
        log.info("ClienteServiceImpl - findById: Buscar cliente por id: " +
                tipoHotelDTO.getId());

        Optional<TipohotelEntity> tipohotelEntity = tipoHotelRepository.findById(tipoHotelDTO.getId());
        if(tipohotelEntity.isPresent()) {
            tipoHotelDTO = TipoHotelDTO.convertToDTO(tipohotelEntity.get());
            return tipoHotelDTO;
        }else {
            return null;
        }
    }
}
