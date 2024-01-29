package proyecto.vaigo.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.vaigo.model.dto.ViajesDTO;
import proyecto.vaigo.repository.ViajesRepository;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class ViajesServiceImpl implements ViajesService {
    private static final Logger log = LoggerFactory.getLogger(ItinerarioServiceImpl.class);

    @Autowired
    private ViajesRepository viajesRepository;

    @Override
    public List<ViajesDTO> findAll() {
        log.info("ClienteServiceImpl - findAll: Lista de todos los cliente");
        List<ViajesDTO> listaViajesDTO = viajesRepository.findAll()
                .stream()
                .map(p -> ViajesDTO.convertToDTO(p))
                .collect(Collectors.toList());

        return listaViajesDTO;
    }
}
