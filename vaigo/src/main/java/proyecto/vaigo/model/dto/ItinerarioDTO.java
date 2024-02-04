package proyecto.vaigo.model.dto;

import jakarta.persistence.*;
import lombok.Data;
import proyecto.vaigo.model.entity.ItinerarioEntity;

import java.util.Objects;

@Data
public class ItinerarioDTO {
    private int id;
    private int idExcursion;
    private String nombre;
    private String cometario;
    private Integer idHistorialViajes;
    private Double puntuacion;

    public static ItinerarioDTO ConvertToDTO(ItinerarioEntity itinerarioEntity) {
        ItinerarioDTO itinerarioDTO = new ItinerarioDTO();
        itinerarioDTO.setId(itinerarioEntity.getId());
        itinerarioDTO.setIdExcursion(itinerarioEntity.getIdExcursion());
        itinerarioDTO.setNombre(itinerarioEntity.getNombre());
        itinerarioDTO.setCometario(itinerarioEntity.getCometario());
        itinerarioDTO.setIdHistorialViajes(itinerarioEntity.getIdHistorialViajes());
        itinerarioDTO.setPuntuacion(itinerarioEntity.getPuntuacion());
        return itinerarioDTO;
    }

    public static ItinerarioEntity ConvertToEntity(ItinerarioDTO itinerarioDTO) {
        ItinerarioEntity itinerarioEntity = new ItinerarioEntity();
        itinerarioEntity.setId(itinerarioDTO.getId());
        itinerarioEntity.setIdExcursion(itinerarioDTO.getIdExcursion());
        itinerarioEntity.setNombre(itinerarioDTO.getNombre());
        itinerarioEntity.setCometario(itinerarioDTO.getCometario());
        itinerarioEntity.setIdHistorialViajes(itinerarioDTO.getIdHistorialViajes());
        itinerarioEntity.setPuntuacion(itinerarioDTO.getPuntuacion());
        return itinerarioEntity;
    }
}
