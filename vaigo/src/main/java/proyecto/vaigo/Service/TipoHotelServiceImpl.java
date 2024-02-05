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
    private TipoHotelRepository TipohotelRepository;

    @Override
    public List<TipoHotelDTO> findAll() {
        log.info("ClienteServiceImpl - findAll: Lista de todos los cliente");
        List<TipoHotelDTO> listaTipohotelDTO = TipohotelRepository.findAll()
                .stream()
                .map(p -> TipoHotelDTO.convertToDTO(p))
                .collect(Collectors.toList());

        return listaTipohotelDTO;
    }
    @Override
    public TipoHotelDTO findById(TipoHotelDTO TipohotelDTO) {
        log.info("ClienteServiceImpl - findById: Buscar cliente por id: " +
                TipohotelDTO.getId());

        Optional<TipohotelEntity> TipohotelEntity = TipohotelRepository.findById(TipohotelDTO.getId());
        if(TipohotelEntity.isPresent()) {
            TipohotelDTO = TipoHotelDTO.convertToDTO(TipohotelEntity.get());
            return TipohotelDTO;
        }else {
            return null;
        }
    }
}
