package proyecto.vaigo.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Objects;

@Entity
@Table(name = "historialviajes")
@Data
public class HistorialViajes {
    @Id
    private Long id;
    private Long idUsuario;
    private Long idViaje;
    private Long idItinerario;
    private String comentario;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HistorialViajes that = (HistorialViajes) o;
        return Objects.equals(idUsuario, that.idUsuario) && Objects.equals(idViaje, that.idViaje) && Objects.equals(idItinerario, that.idItinerario) && Objects.equals(comentario, that.comentario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, idViaje, idItinerario, comentario);
    }
}
