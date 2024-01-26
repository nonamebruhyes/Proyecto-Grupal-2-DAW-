package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Objects;
@Data
@Entity
public class Hotel {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID", nullable = false)
	private int id;
	@Basic
	@Column(name = "NOMBRE", nullable = true, length = 30)
	private String nombre;
	@Basic
	@Column(name = "ID_PAIS", nullable = false)
	private int idPais;
	@Basic
	@Column(name = "ID_CIUDAD", nullable = false)
	private int idCiudad;
	@Basic
	@Column(name = "ID_TIPOHOTEL", nullable = false)
	private int idTipohotel;
	@Basic
	@Column(name = "PRECIO", nullable = true, precision = 0)
	private Double precio;
	@ManyToOne
	@JoinColumn(name = "ID_PAIS", referencedColumnName = "ID", nullable = false)
	private Pais paisByIdPais;
	@ManyToOne
	@JoinColumn(name = "ID_CIUDAD", referencedColumnName = "ID", nullable = false)
	private Ciudades ciudadesByIdCiudad;
	@ManyToOne
	@JoinColumn(name = "ID_TIPOHOTEL", referencedColumnName = "ID", nullable = false)
	private TipoHotel tipohotelByIdTipohotel;
	@OneToMany(mappedBy = "hotelByIdHotel")
	private Collection<Viajes> viajesById;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Hotel hotel = (Hotel) o;
		return id == hotel.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
