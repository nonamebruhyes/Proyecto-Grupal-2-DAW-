package proyecto.vaigo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import proyecto.vaigo.model.entity.Ciudades;
import proyecto.vaigo.model.entity.Usuarios;

@Repository
@Transactional
public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
}