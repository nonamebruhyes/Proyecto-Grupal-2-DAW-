package proyecto.vaigo.model.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "EXCURSION", schema = "vaigo", catalog = "")
public class ExcursionEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private int id;
	@Basic
	@Column(name = "ID_PAIS")
	private int idPais;
	@Basic
	@Column(name = "ID_CIUDAD")
	private int idCiudad;
	@Basic
	@Column(name = "TIPO")
	private String tipo;
	@Basic
	@Column(name = "PRECIO")
	private Double precio;
	@Basic
	@Column(name = "NOMBRE")
	private String nombre;
	@Basic
	@Column(name = "FEC_INICIO")
	private Timestamp fecInicio;
	@Basic
	@Column(name = "DURACION")
	private Timestamp duracion;
	@ManyToOne
	@JoinColumn(name = "ID_PAIS", referencedColumnName = "ID", nullable = false)
	private PaisEntity paisByIdPais;
	@ManyToOne
	@JoinColumn(name = "ID_CIUDAD", referencedColumnName = "ID", nullable = false)
	private CiudadesEntity ciudadesByIdCiudad;
	@OneToMany(mappedBy = "excursionByIdExcursion")
	private Collection<ItinerarioEntity> itinerariosById;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Timestamp getFecInicio() {
		return fecInicio;
	}

	public void setFecInicio(Timestamp fecInicio) {
		this.fecInicio = fecInicio;
	}

	public Timestamp getDuracion() {
		return duracion;
	}

	public void setDuracion(Timestamp duracion) {
		this.duracion = duracion;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ExcursionEntity that = (ExcursionEntity) o;
		return id == that.id && idPais == that.idPais && idCiudad == that.idCiudad && Objects.equals(tipo, that.tipo) && Objects.equals(precio, that.precio) && Objects.equals(nombre, that.nombre) && Objects.equals(fecInicio, that.fecInicio) && Objects.equals(duracion, that.duracion);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, idPais, idCiudad, tipo, precio, nombre, fecInicio, duracion);
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

	public Collection<ItinerarioEntity> getItinerariosById() {
		return itinerariosById;
	}

	public void setItinerariosById(Collection<ItinerarioEntity> itinerariosById) {
		this.itinerariosById = itinerariosById;
	}
}
