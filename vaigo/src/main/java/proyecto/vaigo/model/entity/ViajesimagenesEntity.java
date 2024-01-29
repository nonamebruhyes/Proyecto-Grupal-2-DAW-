package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Objects;
@Data
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
}