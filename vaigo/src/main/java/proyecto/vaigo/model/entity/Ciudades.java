package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Objects;

@Data
@Entity
public class Ciudades {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID", nullable = false)
	private int id;
	@Basic
	@Column(name = "ID_PAIS", nullable = false)
	private int idPais;
	@Basic
	@Column(name = "CIUDAD", nullable = true, length = 30)
	private String ciudad;
	@ManyToOne
	@JoinColumn(name = "ID_PAIS", referencedColumnName = "ID", nullable = false)
	private Pais paisByIdPais;
	@OneToMany(mappedBy = "ciudadesByIdCiudad")
	private Collection<Excursion> excursionsById;
	@OneToMany(mappedBy = "ciudadesByIdCiudad")
	private Collection<Hotel> hotelsById;
	@OneToMany(mappedBy = "ciudadesByIdCiudad")
	private Collection<Viajes> viajesById;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Ciudades ciudades = (Ciudades) o;
		return id == ciudades.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
