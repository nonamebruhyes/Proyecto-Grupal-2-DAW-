package proyecto.vaigo.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.vaigo.model.dto.CiudadesDTO;
import proyecto.vaigo.repository.CiudadesRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CiudadesServiceImpl {
    private static final Logger log = LoggerFactory.getLogger(CiudadesServiceImpl.class);

    @Autowired
    private CiudadesRepository ciudadesRepository;

    public List<CiudadesDTO> findAll() {
        log.info("ClienteServiceImpl - findAll: Lista de todos los cliente");
        List<CiudadesDTO> listaCiudadesDTO = ciudadesRepository.findAll()
                .stream()
                .map(p -> CiudadesDTO.convertToDTO(p))
                .collect(Collectors.toList());

        return listaCiudadesDTO;
    }

}
