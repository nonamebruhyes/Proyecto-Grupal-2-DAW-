package proyecto.vaigo.model.entity;

import lombok.Data;
import java.util.Date;
import java.util.Objects;

@Data
public class Viajes {
    private Long id;
    private Long idPais;
    private Long idCiudad;
    private int numeroPersonas;
    private Date fechaIda;
    private Date fechaVuelta;
    private Long idTerreno;
    private Long idItinerario;
    private Long idHotel;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Viajes viajes = (Viajes) o;
        return Objects.equals(id, viajes.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
