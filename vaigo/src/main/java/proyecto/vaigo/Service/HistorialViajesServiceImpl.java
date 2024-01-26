package proyecto.vaigo.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.vaigo.model.dto.HistorialViajesDTO;
import proyecto.vaigo.repository.HistorialViajesRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HistorialViajesServiceImpl implements HistorialViajesService{
    private static final Logger log = LoggerFactory.getLogger(HabitacionServiceImpl.class);

    @Autowired
    private HistorialViajesRepository historialViajesRepository;

    @Override
    public List<HistorialViajesDTO> findAll() {
        log.info("ClienteServiceImpl - findAll: Lista de todos los cliente");
        List<HistorialViajesDTO> listaHistorialDTO = historialViajesRepository.findAll()
                .stream()
                .map(p -> HistorialViajesDTO.convertToDTO(p))
                .collect(Collectors.toList());

        return listaHistorialDTO;
    }
}
