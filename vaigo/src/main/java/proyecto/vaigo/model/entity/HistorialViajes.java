package proyecto.vaigo.model.entity;

import lombok.Data;

@Data
public class HistorialViajes {
    private Long idUsuario;
    private Long idViaje;
    private Long idItinerario;
    private String comentario;
    

}
