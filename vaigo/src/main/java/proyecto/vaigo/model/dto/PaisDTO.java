package proyecto.vaigo.model.dto;

import lombok.Data;
import proyecto.vaigo.model.entity.Pais;

import java.io.Serializable;


@Data
public class PaisDTO implements Serializable{
    private long id;
    private String pais;
    private String clima;

    public static PaisDTO convertToDTO(Pais pais){
        PaisDTO paisDTO = new PaisDTO();
        paisDTO.setId(pais.getId());
        paisDTO.setPais(pais.getPais());
        paisDTO.setClima(pais.getClima());

        return paisDTO;
    }
    public static Pais convertoToEntity(PaisDTO paisDTO){
        Pais pais = new Pais();
        pais.setId(paisDTO.getId());
        pais.setPais(paisDTO.getPais());
        pais.setClima(paisDTO.getClima());

        return pais;
    }
}
