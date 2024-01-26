package proyecto.vaigo.model.dto;

import lombok.Data;
import proyecto.vaigo.model.entity.Transporte;


import java.io.Serializable;

@Data
public class TransporteDTO implements Serializable{
    private long id;
    private String tipo;


    public static TransporteDTO convertToDTO(Transporte transporte){
        TransporteDTO transporteDTO = new TransporteDTO();
        transporteDTO.setId(transporte.getId());
        transporteDTO.setTipo(transporte.getTipo());

        return transporteDTO;
    }

    public static Transporte convertoToEntity(TransporteDTO transporteDTO){
        Transporte transporte = new Transporte();
        transporte.setId(transporteDTO.getId());
        transporte.setTipo(transporteDTO.getTipo());

        return transporte;
    }
}
