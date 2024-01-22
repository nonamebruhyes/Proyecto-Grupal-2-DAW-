package proyecto.vaigo.model.entity;

import lombok.Data;

import java.util.Objects;

@Data
public class Pais {
    private Long id;
    private String pais;
    private String clima;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pais pais = (Pais) o;
        return Objects.equals(id, pais.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
