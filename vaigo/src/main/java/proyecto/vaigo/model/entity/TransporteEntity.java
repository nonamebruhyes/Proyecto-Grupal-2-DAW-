package proyecto.vaigo.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Objects;
@Data
@Entity
@Table(name = "TRANSPORTE", schema = "vaigo", catalog = "")
public class TransporteEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private int id;
	@Basic
	@Column(name = "TIPO")
	private String tipo;
	@Basic
	@Column(name = "CLIMA")
	private String clima;
	@Basic
	@Column(name = "PRECIO")
	private Double precio;
	@OneToMany(mappedBy = "transporteByIdTransporte")
	private Collection<ViajesEntity> viajesById;
}