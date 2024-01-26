package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Objects;

@Data
@Entity
public class Viajesimagenes {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID", nullable = false)
	private int id;
	@Basic
	@Column(name = "URL", nullable = true, length = 300)
	private String url;
	@OneToMany(mappedBy = "viajesimagenesByIdViajesimagenes")
	private Collection<Viajes> viajesById;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Viajesimagenes that = (Viajesimagenes) o;
		return id == that.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
