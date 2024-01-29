package proyecto.vaigo.model.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "VIAJES", schema = "vaigo", catalog = "")
public class ViajesEntity {
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
	@Column(name = "IDA")
	private Date ida;
	@Basic
	@Column(name = "VUELTA")
	private Date vuelta;
	@Basic
	@Column(name = "ID_TERRENO")
	private int idTerreno;
	@Basic
	@Column(name = "ID_HOTEL")
	private int idHotel;
	@Basic
	@Column(name = "ID_TRANSPORTE")
	private int idTransporte;
	@Basic
	@Column(name = "ID_VIAJESIMAGENES")
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

	public Date getIda() {
		return ida;
	}

	public void setIda(Date ida) {
		this.ida = ida;
	}

	public Date getVuelta() {
		return vuelta;
	}

	public void setVuelta(Date vuelta) {
		this.vuelta = vuelta;
	}

	public int getIdTerreno() {
		return idTerreno;
	}

	public void setIdTerreno(int idTerreno) {
		this.idTerreno = idTerreno;
	}

	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public int getIdTransporte() {
		return idTransporte;
	}

	public void setIdTransporte(int idTransporte) {
		this.idTransporte = idTransporte;
	}

	public int getIdViajesimagenes() {
		return idViajesimagenes;
	}

	public void setIdViajesimagenes(int idViajesimagenes) {
		this.idViajesimagenes = idViajesimagenes;
	}

	public Double getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(Double puntuacion) {
		this.puntuacion = puntuacion;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ViajesEntity that = (ViajesEntity) o;
		return id == that.id && idPais == that.idPais && idCiudad == that.idCiudad && idTerreno == that.idTerreno && idHotel == that.idHotel && idTransporte == that.idTransporte && idViajesimagenes == that.idViajesimagenes && Objects.equals(ida, that.ida) && Objects.equals(vuelta, that.vuelta) && Objects.equals(puntuacion, that.puntuacion);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, idPais, idCiudad, ida, vuelta, idTerreno, idHotel, idTransporte, idViajesimagenes, puntuacion);
	}

	public Collection<HistorialviajesEntity> getHistorialviajesById() {
		return historialviajesById;
	}

	public void setHistorialviajesById(Collection<HistorialviajesEntity> historialviajesById) {
		this.historialviajesById = historialviajesById;
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

	public TerrenoEntity getTerrenoByIdTerreno() {
		return terrenoByIdTerreno;
	}

	public void setTerrenoByIdTerreno(TerrenoEntity terrenoByIdTerreno) {
		this.terrenoByIdTerreno = terrenoByIdTerreno;
	}

	public HotelEntity getHotelByIdHotel() {
		return hotelByIdHotel;
	}

	public void setHotelByIdHotel(HotelEntity hotelByIdHotel) {
		this.hotelByIdHotel = hotelByIdHotel;
	}

	public TransporteEntity getTransporteByIdTransporte() {
		return transporteByIdTransporte;
	}

	public void setTransporteByIdTransporte(TransporteEntity transporteByIdTransporte) {
		this.transporteByIdTransporte = transporteByIdTransporte;
	}

	public ViajesimagenesEntity getViajesimagenesByIdViajesimagenes() {
		return viajesimagenesByIdViajesimagenes;
	}

	public void setViajesimagenesByIdViajesimagenes(ViajesimagenesEntity viajesimagenesByIdViajesimagenes) {
		this.viajesimagenesByIdViajesimagenes = viajesimagenesByIdViajesimagenes;
	}
}
