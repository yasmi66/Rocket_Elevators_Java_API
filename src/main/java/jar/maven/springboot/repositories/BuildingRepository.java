package jar.maven.springboot.repositories;

import jar.maven.springboot.entities.Building;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface BuildingRepository extends JpaRepository<Building, Long> {
    Optional<Building> findAllById(long id);
}
