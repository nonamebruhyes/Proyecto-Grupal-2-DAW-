package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Objects;
@Data
@Entity
@Table(name = "HOTEL", schema = "vaigo", catalog = "")
public class HotelEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private int id;
	@Basic
	@Column(name = "NOMBRE")
	private String nombre;
	@Basic
	@Column(name = "ID_PAIS",insertable=false, updatable=false)
	private int idPais;
	@Basic
	@Column(name = "ID_CIUDAD",insertable=false, updatable=false)
	private int idCiudad;
	@Basic
	@Column(name = "ID_TIPOHOTEL",insertable=false, updatable=false)
	private int idTipohotel;
	@Basic
	@Column(name = "PRECIO")
	private Double precio;


	@ManyToOne
	@JoinColumn(name = "ID_PAIS", referencedColumnName = "ID", nullable = false)
	private PaisEntity paisByIdPais;
	@ManyToOne
	@JoinColumn(name = "ID_CIUDAD", referencedColumnName = "ID", nullable = false)
	private CiudadesEntity ciudadesByIdCiudad;
	@ManyToOne
	@JoinColumn(name = "ID_TIPOHOTEL", referencedColumnName = "ID", nullable = false)
	private TipohotelEntity tipohotelByIdTipohotel;
	@OneToMany(mappedBy = "hotelByIdHotel")
	private Collection<ViajesEntity> viajesById;
}