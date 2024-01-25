package proyecto.vaigo.model.dto;

import lombok.Data;
import proyecto.vaigo.model.entity.Itinerario;

import java.io.Serializable;


@Data
public class ItinerarioDTO implements Serializable{
    private long id;
    private long idExcursion;

    public static ItinerarioDTO convItinerarioDTO(Itinerario itinerario){
        ItinerarioDTO itinerarioDTO = new ItinerarioDTO();
        itinerarioDTO.setId(itinerario.getId());
        itinerarioDTO.setIdExcursion(itinerario.getIdExcursion());

        return itinerarioDTO;
    }
    public static Itinerario convertToEntity(ItinerarioDTO itinerarioDTO){
        Itinerario  itinerario = new Itinerario();
        itinerario.setId(itinerarioDTO.getId());
        itinerario.setIdExcursion(itinerarioDTO.getIdExcursion());

        return itinerario;
    }
}
