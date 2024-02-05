package proyecto.vaigo.model.dto;
import lombok.Data;
import proyecto.vaigo.model.entity.HistorialviajesEntity;

import java.io.Serializable;
@Data
public class HistorialViajesDTO implements Serializable {

    private int id;

    private int idUsuario;

    private int idViaje;

    private String comentario;

    private Integer numpersonas;

    private Double precioTotal;


    public static HistorialViajesDTO convertToDTO(HistorialviajesEntity historialViajes){
       HistorialViajesDTO historialViajesDTO = new HistorialViajesDTO();
       historialViajesDTO.setId(historialViajes.getId());
       historialViajesDTO.setIdUsuario(historialViajes.getIdUsuario());
       historialViajesDTO.setIdViaje(historialViajes.getIdViaje());
       historialViajesDTO.setPrecioTotal(historialViajes.getPrecioTotal());
       historialViajesDTO.setNumpersonas(historialViajes.getNumpersonas());
       return historialViajesDTO;
    }
    public static HistorialviajesEntity convertToEntity(HistorialViajesDTO historialViajesDTO) {
        HistorialviajesEntity historialViajes = new HistorialviajesEntity();
        historialViajes.setId(historialViajesDTO.getId());
        historialViajes.setIdUsuario(historialViajesDTO.getIdUsuario());
        historialViajes.setIdViaje(historialViajesDTO.getIdViaje());
        historialViajes.setPrecioTotal(historialViajesDTO.getPrecioTotal());
        historialViajes.setNumpersonas(historialViajesDTO.getNumpersonas());

        return historialViajes;

    }

}
