package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Objects;
@Data
@Entity
@Table(name = "TERRENO", schema = "vaigo", catalog = "")
public class TerrenoEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private int id;
	@Basic
	@Column(name = "TIPO")
	private String tipo;
	@OneToMany(mappedBy = "terrenoByIdTerreno")
	private Collection<ViajesEntity> viajesById;
}