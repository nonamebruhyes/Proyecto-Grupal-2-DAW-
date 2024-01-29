package proyecto.vaigo.model.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Historialviajes {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private int id;
    @Basic
    @Column(name = "ID_USUARIO")
    private int idUsuario;
    @Basic
    @Column(name = "ID_VIAJE")
    private int idViaje;
    @Basic
    @Column(name = "COMENTARIO")
    private String comentario;
    @Basic
    @Column(name = "NUMPERSONAS")
    private Integer numpersonas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(int idViaje) {
        this.idViaje = idViaje;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Integer getNumpersonas() {
        return numpersonas;
    }

    public void setNumpersonas(Integer numpersonas) {
        this.numpersonas = numpersonas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Historialviajes that = (Historialviajes) o;
        return id == that.id && idUsuario == that.idUsuario && idViaje == that.idViaje && Objects.equals(comentario, that.comentario) && Objects.equals(numpersonas, that.numpersonas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idUsuario, idViaje, comentario, numpersonas);
    }
}
