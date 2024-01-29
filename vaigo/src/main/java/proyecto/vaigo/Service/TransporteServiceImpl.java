package proyecto.vaigo.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.vaigo.model.dto.TransporteDTO;
import proyecto.vaigo.repository.TransporteRepository;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class TransporteServiceImpl implements TransporteService{
    private static final Logger log = LoggerFactory.getLogger(ItinerarioServiceImpl.class);

    @Autowired
    private TransporteRepository transporteRepository;

    @Override
    public List<TransporteDTO> findAll() {
        log.info("ClienteServiceImpl - findAll: Lista de todos los cliente");
        List<TransporteDTO> listaTransporteDTO = transporteRepository.findAll()
                .stream()
                .map(p -> TransporteDTO.convertToDTO(p))
                .collect(Collectors.toList());

        return listaTransporteDTO;
    }
}
