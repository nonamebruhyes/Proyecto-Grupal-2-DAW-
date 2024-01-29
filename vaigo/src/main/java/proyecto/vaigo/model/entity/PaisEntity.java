package proyecto.vaigo.model.entity;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "PAIS", schema = "vaigo", catalog = "")
public class PaisEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private int id;
	@Basic
	@Column(name = "PAIS")
	private String pais;
	@OneToMany(mappedBy = "paisByIdPais")
	private Collection<CiudadesEntity> ciudadesById;
	@OneToMany(mappedBy = "paisByIdPais")
	private Collection<ExcursionEntity> excursionsById;
	@OneToMany(mappedBy = "paisByIdPais")
	private Collection<HotelEntity> hotelsById;
	@OneToMany(mappedBy = "paisByIdPais")
	private Collection<ViajesEntity> viajesById;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		PaisEntity that = (PaisEntity) o;
		return id == that.id && Objects.equals(pais, that.pais);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, pais);
	}

	public Collection<CiudadesEntity> getCiudadesById() {
		return ciudadesById;
	}

	public void setCiudadesById(Collection<CiudadesEntity> ciudadesById) {
		this.ciudadesById = ciudadesById;
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
