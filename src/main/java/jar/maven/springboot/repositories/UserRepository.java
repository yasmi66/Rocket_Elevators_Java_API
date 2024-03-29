package jar.maven.springboot.repositories;

import jar.maven.springboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findAllById(long id);
    Optional<User> findByEmail(String email);
}