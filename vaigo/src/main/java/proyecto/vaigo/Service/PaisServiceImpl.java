package proyecto.vaigo.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.vaigo.model.dto.PaisDTO;
import proyecto.vaigo.repository.PaisRepository;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class PaisServiceImpl implements PaisService{
    private static final Logger log = LoggerFactory.getLogger(ItinerarioServiceImpl.class);

    @Autowired
    private PaisRepository paisRepository;

    @Override
    public List<PaisDTO> findAll() {
        log.info("ClienteServiceImpl - findAll: Lista de todos los cliente");
        List<PaisDTO> listaPaisDTO = paisRepository.findAll()
                .stream()
                .map(p -> PaisDTO.convertToDTO(p))
                .collect(Collectors.toList());

        return listaPaisDTO;
    }
}
