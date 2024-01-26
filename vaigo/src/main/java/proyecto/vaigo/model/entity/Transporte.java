package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Objects;
@Data
@Entity
public class Transporte {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID", nullable = false)
	private int id;
	@Basic
	@Column(name = "TIPO", nullable = true, length = 30)
	private String tipo;
	@Basic
	@Column(name = "CLIMA", nullable = true, length = 30)
	private String clima;
	@Basic
	@Column(name = "PRECIO", nullable = true, precision = 0)
	private Double precio;
	@OneToMany(mappedBy = "transporteByIdTransporte")
	private Collection<Viajes> viajesById;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Transporte that = (Transporte) o;
		return id == that.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
