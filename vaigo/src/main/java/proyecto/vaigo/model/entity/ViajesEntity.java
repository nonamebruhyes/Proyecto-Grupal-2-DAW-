package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.Collection;
import java.util.Objects;
@Data
@Entity
@Table(name = "VIAJES", schema = "vaigo", catalog = "")
public class ViajesEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private int id;
	@Basic
	@Column(name = "ID_PAIS",insertable=false, updatable=false)
	private int idPais;
	@Basic
	@Column(name = "ID_CIUDAD",insertable=false, updatable=false)
	private int idCiudad;
	@Basic
	@Column(name = "IDA")
	private Date ida;
	@Basic
	@Column(name = "VUELTA")
	private Date vuelta;
	@Basic
	@Column(name = "ID_TERRENO",insertable=false, updatable=false)
	private int idTerreno;
	@Basic
	@Column(name = "ID_HOTEL",insertable=false, updatable=false)
	private int idHotel;
	@Basic
	@Column(name = "ID_TRANSPORTE",insertable=false, updatable=false)
	private int idTransporte;
	@Basic
	@Column(name = "ID_VIAJESIMAGENES",insertable=false, updatable=false)
	private int idViajesimagenes;
	@Basic
	@Column(name = "PUNTUACION")
	private Double puntuacion;
	@OneToMany(mappedBy = "viajesByIdViaje")
	private Collection<HistorialviajesEntity> historialviajesById;
	@ManyToOne
	@JoinColumn(name = "ID_PAIS", referencedColumnName = "ID", nullable = false)
	private PaisEntity paisByIdPais;
	@ManyToOne
	@JoinColumn(name = "ID_CIUDAD", referencedColumnName = "ID", nullable = false)
	private CiudadesEntity ciudadesByIdCiudad;
	@ManyToOne
	@JoinColumn(name = "ID_TERRENO", referencedColumnName = "ID", nullable = false)
	private TerrenoEntity terrenoByIdTerreno;
	@ManyToOne
	@JoinColumn(name = "ID_HOTEL", referencedColumnName = "ID", nullable = false)
	private HotelEntity hotelByIdHotel;
	@ManyToOne
	@JoinColumn(name = "ID_TRANSPORTE", referencedColumnName = "ID", nullable = false)
	private TransporteEntity transporteByIdTransporte;
	@ManyToOne
	@JoinColumn(name = "ID_VIAJESIMAGENES", referencedColumnName = "ID", nullable = false)
	private ViajesimagenesEntity viajesimagenesByIdViajesimagenes;
}