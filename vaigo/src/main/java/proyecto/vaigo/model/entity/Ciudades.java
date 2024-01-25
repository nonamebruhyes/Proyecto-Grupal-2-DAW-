package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;


@Data
@Entity
@Table(name="ciudades")
public class Ciudades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "CIUDAD")
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
