package proyecto.vaigo.model.entity;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getClima() {
		return clima;
	}

	public void setClima(String clima) {
		this.clima = clima;
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
		TransporteEntity that = (TransporteEntity) o;
		return id == that.id && Objects.equals(tipo, that.tipo) && Objects.equals(clima, that.clima) && Objects.equals(precio, that.precio);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, tipo, clima, precio);
	}

	public Collection<ViajesEntity> getViajesById() {
		return viajesById;
	}

	public void setViajesById(Collection<ViajesEntity> viajesById) {
		this.viajesById = viajesById;
	}
}
