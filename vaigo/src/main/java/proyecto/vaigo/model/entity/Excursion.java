package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.Objects;
@Entity
@Table(name = "Excursion")
@Data
public class Excursion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idPais;
    private Long idCiudad;
    private String tipo;
    private String nombre;
    private Date fechaInicio;
    private Date horaInicio;/* Duda sobre tipo de variable que utilizar para el tiempo*/
    private Date duracion;/* Duda sobre tipo de variable que utilizar para el tiempo*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Excursion excursion = (Excursion) o;
        return Objects.equals(id, excursion.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
