package jar.maven.springboot.repositories;

import jar.maven.springboot.entities.Interventions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface InterventionsRepository extends JpaRepository<Interventions, Long> {
    Optional<Interventions> findAllById(long id);
}
