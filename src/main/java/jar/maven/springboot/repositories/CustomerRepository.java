package jar.maven.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import jar.maven.springboot.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
