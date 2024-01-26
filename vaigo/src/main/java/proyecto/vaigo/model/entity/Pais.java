package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Objects;
@Data
@Entity
public class Pais {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID", nullable = false)
	private int id;
	@Basic
	@Column(name = "PAIS", nullable = true, length = 30)
	private String pais;
	@OneToMany(mappedBy = "paisByIdPais")
	private Collection<Ciudades> ciudadesById;
	@OneToMany(mappedBy = "paisByIdPais")
	private Collection<Excursion> excursionsById;
	@OneToMany(mappedBy = "paisByIdPais")
	private Collection<Hotel> hotelsById;
	@OneToMany(mappedBy = "paisByIdPais")
	private Collection<Viajes> viajesById;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Pais pais = (Pais) o;
		return id == pais.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
