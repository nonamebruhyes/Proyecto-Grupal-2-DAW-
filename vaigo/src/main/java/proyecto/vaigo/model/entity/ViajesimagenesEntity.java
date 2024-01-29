package proyecto.vaigo.model.entity;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "VIAJESIMAGENES", schema = "vaigo", catalog = "")
public class ViajesimagenesEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private int id;
	@Basic
	@Column(name = "URL")
	private String url;
	@OneToMany(mappedBy = "viajesimagenesByIdViajesimagenes")
	private Collection<ViajesEntity> viajesById;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ViajesimagenesEntity that = (ViajesimagenesEntity) o;
		return id == that.id && Objects.equals(url, that.url);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, url);
	}

	public Collection<ViajesEntity> getViajesById() {
		return viajesById;
	}

	public void setViajesById(Collection<ViajesEntity> viajesById) {
		this.viajesById = viajesById;
	}
}
