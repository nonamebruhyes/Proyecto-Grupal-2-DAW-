package proyecto.vaigo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import proyecto.vaigo.model.entity.UsuariosEntity;
import proyecto.vaigo.model.entity.ViajesEntity;

import java.util.List;


@Repository
@Transactional
public interface UsuariosRepository extends JpaRepository<UsuariosEntity, Integer> {
    @Query(value = "SELECT * FROM usuarios WHERE username = :idc and password = :idc1",
            nativeQuery = true)
    public List<UsuariosEntity> findUsuario(@Param("idc") String nombreUsuario, @Param("idc1") String pass);

}
