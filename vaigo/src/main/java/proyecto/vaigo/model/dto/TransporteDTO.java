package proyecto.vaigo.model.dto;

import lombok.Data;
import proyecto.vaigo.model.entity.TransporteEntity;


import java.io.Serializable;


@Data
public class TransporteDTO implements Serializable{
    private int id;
    private String tipo;


    public static TransporteDTO convertToDTO(TransporteEntity transporte){
        TransporteDTO transporteDTO = new TransporteDTO();
        transporteDTO.setId(transporte.getId());
        transporteDTO.setTipo(transporte.getTipo());

        return transporteDTO;
    }

    public static TransporteEntity convertoToEntity(TransporteDTO transporteDTO){
        TransporteEntity transporte = new TransporteEntity();
        transporte.setId(transporteDTO.getId());
        transporte.setTipo(transporteDTO.getTipo());
        return transporte;
    }
}
