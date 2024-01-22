package proyecto.vaigo.model.entity;

import lombok.Data;

import java.util.Objects;

@Data
public class Itinerario {
    private Long id;
    private Long idExcursion;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Itinerario that = (Itinerario) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
