package proyecto.vaigo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import proyecto.vaigo.model.entity.Ciudades;
import proyecto.vaigo.model.entity.Transporte;

@Repository
@Transactional
public interface TransporteRepository extends JpaRepository<Transporte, Long> {
}
