package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Objects;
@Data
@Entity
public class Itinerario {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID", nullable = false)
	private int id;
	@Basic
	@Column(name = "ID_EXCURSION", nullable = false)
	private int idExcursion;
	@ManyToOne
	@JoinColumn(name = "ID_EXCURSION", referencedColumnName = "ID", nullable = false)
	private Excursion excursionByIdExcursion;
	@OneToMany(mappedBy = "itinerarioByIdItinerario")
	private Collection<Viajes> viajesById;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Itinerario that = (Itinerario) o;
		return id == that.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
