package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;
@Entity
@Table(name = "tipoHotel")
@Data
public class TipoHotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoHotel tipoHotel = (TipoHotel) o;
        return Objects.equals(id, tipoHotel.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
