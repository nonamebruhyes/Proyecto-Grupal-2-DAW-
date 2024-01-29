package proyecto.vaigo.model.dto;

import lombok.Data;
import proyecto.vaigo.model.entity.ItinerarioEntity;

import java.io.Serializable;


@Data
public class ItinerarioDTO implements Serializable{
    private int  id;
    private int idExcursion;

    public static ItinerarioDTO convertToDTO(ItinerarioEntity itinerario){
        ItinerarioDTO itinerarioDTO = new ItinerarioDTO();
        itinerarioDTO.setId(itinerario.getId());
        itinerarioDTO.setIdExcursion(itinerario.getIdExcursion());

        return itinerarioDTO;
    }
    public static ItinerarioEntity convertToEntity(ItinerarioDTO itinerarioDTO){
        ItinerarioEntity  itinerario = new ItinerarioEntity();
        itinerario.setId(itinerarioDTO.getId());
        itinerario.setIdExcursion(itinerarioDTO.getIdExcursion());

        return itinerario;
    }


}
