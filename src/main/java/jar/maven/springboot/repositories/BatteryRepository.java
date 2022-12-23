package jar.maven.springboot.repositories;

import jar.maven.springboot.entities.Battery;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface BatteryRepository extends JpaRepository<Battery, Long> {
    Optional<Battery> findAllById(long id);
}
