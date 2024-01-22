package proyecto.vaigo.model.entity;

import lombok.Data;

import java.util.Objects;

@Data
public class TipoHotel {
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
