package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;
@Data
@Entity
public class Excursion {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID", nullable = false)
	private int id;
	@Basic
	@Column(name = "ID_PAIS", nullable = false)
	private int idPais;
	@Basic
	@Column(name = "ID_CIUDAD", nullable = false)
	private int idCiudad;
	@Basic
	@Column(name = "TIPO", nullable = true, length = 30)
	private String tipo;
	@Basic
	@Column(name = "PRECIO", nullable = true, precision = 0)
	private Double precio;
	@Basic
	@Column(name = "NOMBRE", nullable = true, length = 30)
	private String nombre;
	@Basic
	@Column(name = "FEC_INICIO", nullable = false)
	private Timestamp fecInicio;
	@Basic
	@Column(name = "FEC_FIN", nullable = false)
	private Timestamp fecFin;
	@Basic
	@Column(name = "DURACION", nullable = false)
	private Timestamp duracion;
	@ManyToOne
	@JoinColumn(name = "ID_PAIS", referencedColumnName = "ID", nullable = false)
	private Pais paisByIdPais;
	@ManyToOne
	@JoinColumn(name = "ID_CIUDAD", referencedColumnName = "ID", nullable = false)
	private Ciudades ciudadesByIdCiudad;
	@OneToMany(mappedBy = "excursionByIdExcursion")
	private Collection<Itinerario> itinerariosById;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Excursion excursion = (Excursion) o;
		return id == excursion.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
