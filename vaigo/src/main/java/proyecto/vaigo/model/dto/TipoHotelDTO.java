package proyecto.vaigo.model.dto;

import lombok.Data;
import proyecto.vaigo.model.entity.TipohotelEntity;

import java.io.Serializable;


@Data
public class TipoHotelDTO implements Serializable{
    private int id;
    private String tipo;


    public static TipoHotelDTO convertoToDTO(TipohotelEntity tipoHotel){
        TipoHotelDTO tipoHotelDTO = new TipoHotelDTO();
        tipoHotelDTO.setId(tipoHotel.getId());
        tipoHotelDTO.setTipo(tipoHotel.getTipo());

        return tipoHotelDTO;
    }

    public static TipohotelEntity convertToEntity(TipoHotelDTO tipoHotelDTO){
        TipohotelEntity tipoHotel = new TipohotelEntity();
        tipoHotel.setId(tipoHotelDTO.getId());
        tipoHotel.setTipo(tipoHotelDTO.getTipo());

        return  tipoHotel;
    }
}
