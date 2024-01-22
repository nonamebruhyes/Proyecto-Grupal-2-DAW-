package proyecto.vaigo.model.entity;

import lombok.Data;

import java.util.Date;
import java.util.Objects;

@Data
public class Habitacion {
    private Long id;
    private String estado;
    private Date fechaInicio;
    private Date fechaFin;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Habitacion that = (Habitacion) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
