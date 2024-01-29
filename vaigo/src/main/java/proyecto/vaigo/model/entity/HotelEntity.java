package proyecto.vaigo.model.entity;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

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
	@Column(name = "ID_PAIS")
	private int idPais;
	@Basic
	@Column(name = "ID_CIUDAD")
	private int idCiudad;
	@Basic
	@Column(name = "ID_TIPOHOTEL")
	private int idTipohotel;
	@Basic
	@Column(name = "PRECIO")
	private Double precio;
	@OneToMany(mappedBy = "hotelByIdHotel")
	private Collection<HabitacionEntity> habitacionsById;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdPais() {
		return idPais;
	}

	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}

	public int getIdCiudad() {
		return idCiudad;
	}

	public void setIdCiudad(int idCiudad) {
		this.idCiudad = idCiudad;
	}

	public int getIdTipohotel() {
		return idTipohotel;
	}

	public void setIdTipohotel(int idTipohotel) {
		this.idTipohotel = idTipohotel;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		HotelEntity that = (HotelEntity) o;
		return id == that.id && idPais == that.idPais && idCiudad == that.idCiudad && idTipohotel == that.idTipohotel && Objects.equals(nombre, that.nombre) && Objects.equals(precio, that.precio);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nombre, idPais, idCiudad, idTipohotel, precio);
	}

	public Collection<HabitacionEntity> getHabitacionsById() {
		return habitacionsById;
	}

	public void setHabitacionsById(Collection<HabitacionEntity> habitacionsById) {
		this.habitacionsById = habitacionsById;
	}

	public PaisEntity getPaisByIdPais() {
		return paisByIdPais;
	}

	public void setPaisByIdPais(PaisEntity paisByIdPais) {
		this.paisByIdPais = paisByIdPais;
	}

	public CiudadesEntity getCiudadesByIdCiudad() {
		return ciudadesByIdCiudad;
	}

	public void setCiudadesByIdCiudad(CiudadesEntity ciudadesByIdCiudad) {
		this.ciudadesByIdCiudad = ciudadesByIdCiudad;
	}

	public TipohotelEntity getTipohotelByIdTipohotel() {
		return tipohotelByIdTipohotel;
	}

	public void setTipohotelByIdTipohotel(TipohotelEntity tipohotelByIdTipohotel) {
		this.tipohotelByIdTipohotel = tipohotelByIdTipohotel;
	}

	public Collection<ViajesEntity> getViajesById() {
		return viajesById;
	}

	public void setViajesById(Collection<ViajesEntity> viajesById) {
		this.viajesById = viajesById;
	}
}
