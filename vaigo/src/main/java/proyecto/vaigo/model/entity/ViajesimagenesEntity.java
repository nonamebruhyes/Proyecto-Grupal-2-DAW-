package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Objects;
@Data
@Entity
@Table(name = "viajesimagenes", schema = "vaigo", catalog = "")
public class ViajesimagenesEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private int id;
	@Basic
	@Column(name = "URL")
	private String url;

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
}
