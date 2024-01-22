package proyecto.vaigo.model.entity;

import lombok.*;

import java.util.Objects;

@Data
public class Ciudades {
    private Long id;
    private String ciudad;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ciudades ciudades = (Ciudades) o;
        return Objects.equals(id, ciudades.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
