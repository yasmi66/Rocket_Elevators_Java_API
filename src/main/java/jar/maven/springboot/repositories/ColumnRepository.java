package jar.maven.springboot.repositories;

import jar.maven.springboot.entities.Column;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ColumnRepository extends JpaRepository<Column, Long>{
    Optional<Column> findAllById(long id);
}
