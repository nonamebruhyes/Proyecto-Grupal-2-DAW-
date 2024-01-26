package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.Objects;
@Data
@Entity
public class Viajes {
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
	@Column(name = "IDA", nullable = false)
	private Date ida;
	@Basic
	@Column(name = "VUELTA", nullable = false)
	private Date vuelta;
	@Basic
	@Column(name = "ID_TERRENO", nullable = false)
	private int idTerreno;
	@Basic
	@Column(name = "ID_ITINERARIO", nullable = false)
	private int idItinerario;
	@Basic
	@Column(name = "ID_HOTEL", nullable = false)
	private int idHotel;
	@Basic
	@Column(name = "ID_TRANSPORTE", nullable = false)
	private int idTransporte;
	@Basic
	@Column(name = "ID_VIAJESIMAGENES", nullable = false)
	private int idViajesimagenes;
	@Basic
	@Column(name = "PUNTUACION", nullable = true, precision = 0)
	private Double puntuacion;
	@Basic
	@Column(name = "PRECIO_TOTAL", nullable = true, precision = 0)
	private Double precioTotal;
	@ManyToOne
	@JoinColumn(name = "ID_PAIS", referencedColumnName = "ID", nullable = false)
	private Pais paisByIdPais;
	@ManyToOne
	@JoinColumn(name = "ID_CIUDAD", referencedColumnName = "ID", nullable = false)
	private Ciudades ciudadesByIdCiudad;
	@ManyToOne
	@JoinColumn(name = "ID_TERRENO", referencedColumnName = "ID", nullable = false)
	private Terreno terrenoByIdTerreno;
	@ManyToOne
	@JoinColumn(name = "ID_ITINERARIO", referencedColumnName = "ID", nullable = false)
	private Itinerario itinerarioByIdItinerario;
	@ManyToOne
	@JoinColumn(name = "ID_HOTEL", referencedColumnName = "ID", nullable = false)
	private Hotel hotelByIdHotel;
	@ManyToOne
	@JoinColumn(name = "ID_TRANSPORTE", referencedColumnName = "ID", nullable = false)
	private Transporte transporteByIdTransporte;
	@ManyToOne
	@JoinColumn(name = "ID_VIAJESIMAGENES", referencedColumnName = "ID", nullable = false)
	private Viajesimagenes viajesimagenesByIdViajesimagenes;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Viajes viajes = (Viajes) o;
		return id == viajes.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
