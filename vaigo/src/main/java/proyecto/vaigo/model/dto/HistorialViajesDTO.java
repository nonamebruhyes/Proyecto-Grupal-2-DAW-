package proyecto.vaigo.model.dto;
import lombok.Data;
import proyecto.vaigo.model.entity.HistorialViajes;

import java.io.Serializable;

@Data
public class HistorialViajesDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private long id;
    private long idUsuario;
    private long idViaje;
    private long idItinerario;
    private String comentario;


    public static HistorialViajesDTO convertToDTO(HistorialViajes historialViajes){
       HistorialViajesDTO historialViajesDTO = new HistorialViajesDTO();
       historialViajesDTO.setId(historialViajes.getId());
       historialViajesDTO.setIdUsuario(historialViajes.getIdUsuario());
       historialViajesDTO.setIdViaje(historialViajes.getIdViaje());
       historialViajesDTO.setIdItinerario(historialViajes.getIdItinerario());
       historialViajesDTO.setComentario(historialViajes.getComentario());
    return historialViajesDTO;   
    }
    public static HistorialViajes convertToEntity(HistorialViajesDTO historialViajesDTO){
        HistorialViajes historialViajes = new HistorialViajes();
        historialViajes.setId(historialViajesDTO.getId());
        historialViajes.setIdUsuario(historialViajesDTO.getIdUsuario());
        historialViajes.setIdViaje(historialViajesDTO.getIdViaje());
        historialViajes.setIdItinerario(historialViajesDTO.getIdItinerario());
        historialViajes.setComentario(historialViajesDTO.getComentario());

        return historialViajes;
    }
}
