package jar.maven.springboot.repositories;

import jar.maven.springboot.entities.Elevator;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ElevatorRepository extends JpaRepository<Elevator, Long> {
    Optional<Elevator> findAllById(long id);
}
