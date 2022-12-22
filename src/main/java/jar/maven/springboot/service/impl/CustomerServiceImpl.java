package jar.maven.springboot.service.impl;

import jar.maven.springboot.entities.Customer;
import jar.maven.springboot.repositories.CustomerRepository;
import jar.maven.springboot.services.CustomerService;
import org.springframework.stereotype.Service;

// CustomerServiceImpl is a class that implements the CustomerService interface
@Service
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
