package proyecto.vaigo.repository;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.vaigo.model.entity.ViajesimagenesEntity;

@Repository
@Transactional
public interface ViajesImagenesRepository extends JpaRepository<ViajesimagenesEntity, Integer>{
}
