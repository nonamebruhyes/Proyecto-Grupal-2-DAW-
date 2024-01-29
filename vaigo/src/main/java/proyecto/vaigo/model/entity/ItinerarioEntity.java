package proyecto.vaigo.model.entity;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "ITINERARIO", schema = "vaigo", catalog = "")
public class ItinerarioEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private int id;
	@Basic
	@Column(name = "ID_EXCURSION")
	private int idExcursion;
	@OneToMany(mappedBy = "itinerarioByIdItinerario")
	private Collection<HistorialviajesEntity> historialviajesById;
	@ManyToOne
	@JoinColumn(name = "ID_EXCURSION", referencedColumnName = "ID", nullable = false)
	private ExcursionEntity excursionByIdExcursion;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdExcursion() {
		return idExcursion;
	}

	public void setIdExcursion(int idExcursion) {
		this.idExcursion = idExcursion;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ItinerarioEntity that = (ItinerarioEntity) o;
		return id == that.id && idExcursion == that.idExcursion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, idExcursion);
	}

	public Collection<HistorialviajesEntity> getHistorialviajesById() {
		return historialviajesById;
	}

	public void setHistorialviajesById(Collection<HistorialviajesEntity> historialviajesById) {
		this.historialviajesById = historialviajesById;
	}

	public ExcursionEntity getExcursionByIdExcursion() {
		return excursionByIdExcursion;
	}

	public void setExcursionByIdExcursion(ExcursionEntity excursionByIdExcursion) {
		this.excursionByIdExcursion = excursionByIdExcursion;
	}
}
