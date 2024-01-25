package proyecto.vaigo.model.dto;

import lombok.Data;
import proyecto.vaigo.model.entity.TipoHotel;

import java.io.Serializable;


@Data
public class TipoHotelDTO implements Serializable{
    private long id;
    private String tipo;


    public static TipoHotelDTO convertoToDTO(TipoHotel tipoHotel){
        TipoHotelDTO tipoHotelDTO = new TipoHotelDTO();
        tipoHotelDTO.setId(tipoHotel.getId());
        tipoHotelDTO.setTipo(tipoHotel.getTipo());

        return tipoHotelDTO;
    }

    public static TipoHotel convertToEntity(TipoHotelDTO tipoHotelDTO){
        TipoHotel tipoHotel = new TipoHotel();
        tipoHotel.setId(tipoHotelDTO.getId());
        tipoHotel.setTipo(tipoHotelDTO.getTipo());

        return  tipoHotel;
    }
}
