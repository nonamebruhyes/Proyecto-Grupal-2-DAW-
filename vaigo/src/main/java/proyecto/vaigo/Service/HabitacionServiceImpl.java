package proyecto.vaigo.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.vaigo.model.dto.CiudadesDTO;
import proyecto.vaigo.model.dto.HabitacionDTO;
import proyecto.vaigo.repository.CiudadesRepository;
import proyecto.vaigo.repository.HabitacionRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HabitacionServiceImpl implements HabitacionService{
    private static final Logger log = LoggerFactory.getLogger(HabitacionServiceImpl.class);

    @Autowired
    private HabitacionRepository habitacionRepository;

    @Override
    public List<HabitacionDTO> findAll() {
        log.info("ClienteServiceImpl - findAll: Lista de todos los cliente");
        List<HabitacionDTO> listaHabitacionDTO = habitacionRepository.findAll()
                .stream()
                .map(p -> HabitacionDTO.convertToDTO(p))
                .collect(Collectors.toList());

        return listaHabitacionDTO;
    }
}
