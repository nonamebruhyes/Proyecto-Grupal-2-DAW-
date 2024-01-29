package proyecto.vaigo.model.dto;

import lombok.Data;
import proyecto.vaigo.model.entity.PaisEntity;

import java.io.Serializable;


@Data
public class PaisDTO implements Serializable{
    private int id;
    private String pais;

    public static PaisDTO convertToDTO(PaisEntity pais){
        PaisDTO paisDTO = new PaisDTO();
        paisDTO.setId(pais.getId());
        paisDTO.setPais(pais.getPais());
       // paisDTO.setClima(pais.getClima());
        return paisDTO;
    }
    public static PaisEntity convertoToEntity(PaisDTO paisDTO){
        PaisEntity pais = new PaisEntity();
        pais.setId(paisDTO.getId());
        pais.setPais(paisDTO.getPais());
        return pais;
    }
}
