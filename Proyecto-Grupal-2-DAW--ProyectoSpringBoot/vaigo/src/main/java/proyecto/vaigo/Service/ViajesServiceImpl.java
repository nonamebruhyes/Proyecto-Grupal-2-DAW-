package proyecto.vaigo.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.vaigo.model.dto.ItinerarioExcursionesDTO;
import proyecto.vaigo.model.dto.ViajesDTO;
import proyecto.vaigo.model.entity.ViajesEntity;
import proyecto.vaigo.repository.ViajesRepository;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ViajesServiceImpl implements ViajesService {
    private static final Logger log = LoggerFactory.getLogger(ViajesServiceImpl.class);

    @Autowired
    private ViajesRepository viajesRepository;

    @Override
    public List<ViajesDTO> findAll() {
        log.info("ClienteServiceImpl - findAll: Lista de todos los cliente");
        List<ViajesDTO> listaViajesDTO = new ArrayList<>();
        for (ViajesEntity element :  viajesRepository.findAll() ) {
            listaViajesDTO.add(ViajesDTO.ConvertToDTO(element));
        }

        return listaViajesDTO;
    }

    @Override
    public ViajesDTO findById(ViajesDTO viajesDTO) {
        log.info("ClienteServiceImpl - findById: Buscar cliente por id: " +
                viajesDTO.getId());
        Optional<ViajesEntity> viajesEntity = viajesRepository.findById(viajesDTO.getId());
        if(viajesEntity.isPresent()) {
            viajesDTO = ViajesDTO.ConvertToDTO(viajesEntity.get());
            return viajesDTO;
        }else {
            return null;
        }
    }
    @Override
    public List<ViajesDTO> findFiltro() {
        /*falta hacer que recoja datos y lo busque esta metido los datos a pelo*/
        log.info("ClienteServiceImpl - findAll: Lista de todos los cliente");
        List<ViajesDTO> listaViajesDTO = viajesRepository.findFilto(9,1,1)
                .stream()
                .map(p -> ViajesDTO.ConvertToDTO(p))
                .collect(Collectors.toList());

        return listaViajesDTO;
    }

    @Override
    public List<ViajesDTO> todosItiid(String dato) {
        log.info(dato);
        List<ViajesDTO> listaitiExDTO = viajesRepository.findIDCiu(dato)
                .stream()
                .map(p -> ViajesDTO.ConvertToDTO(p))
                .collect(Collectors.toList());
        log.info(String.valueOf(listaitiExDTO));
        return listaitiExDTO;
    }
}
