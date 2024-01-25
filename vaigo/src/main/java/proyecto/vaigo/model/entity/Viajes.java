package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.Objects;
@Entity
@Table(name = "Viajes")
@Data
public class Viajes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Pais pais;
    private Ciudades ciudades;
    private int numeroPersonas;
    private Date fechaIda;
    private Date fechaVuelta;
    private Long idTerreno;
    private Long idItinerario;
    private String Descripcion;
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