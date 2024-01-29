package proyecto.vaigo.model.entity;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "CIUDADES", schema = "vaigo", catalog = "")
public class CiudadesEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private int id;
	@Basic
	@Column(name = "ID_PAIS",insertable=false, updatable=false)
	private int idPais;
	@Basic
	@Column(name = "CIUDAD")
	private String ciudad;
	@ManyToOne
	@JoinColumn(name = "ID_PAIS", referencedColumnName = "ID", nullable = false)
	private PaisEntity paisByIdPais;
	@OneToMany(mappedBy = "ciudadesByIdCiudad")
	private Collection<ExcursionEntity> excursionsById;
	@OneToMany(mappedBy = "ciudadesByIdCiudad")
	private Collection<HotelEntity> hotelsById;
	@OneToMany(mappedBy = "ciudadesByIdCiudad")
	private Collection<ViajesEntity> viajesById;

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

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CiudadesEntity that = (CiudadesEntity) o;
		return id == that.id && idPais == that.idPais && Objects.equals(ciudad, that.ciudad);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, idPais, ciudad);
	}

	public PaisEntity getPaisByIdPais() {
		return paisByIdPais;
	}

	public void setPaisByIdPais(PaisEntity paisByIdPais) {
		this.paisByIdPais = paisByIdPais;
	}

	public Collection<ExcursionEntity> getExcursionsById() {
		return excursionsById;
	}

	public void setExcursionsById(Collection<ExcursionEntity> excursionsById) {
		this.excursionsById = excursionsById;
	}

	public Collection<HotelEntity> getHotelsById() {
		return hotelsById;
	}

	public void setHotelsById(Collection<HotelEntity> hotelsById) {
		this.hotelsById = hotelsById;
	}

	public Collection<ViajesEntity> getViajesById() {
		return viajesById;
	}

	public void setViajesById(Collection<ViajesEntity> viajesById) {
		this.viajesById = viajesById;
	}
}
