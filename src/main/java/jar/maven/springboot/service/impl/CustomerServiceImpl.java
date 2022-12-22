package jar.maven.springboot.service.impl;

import jar.maven.springboot.entities.Customer;
import jar.maven.springboot.exceptions.ResourceNotFoundException;
import jar.maven.springboot.repositories.CustomerRepository;
import jar.maven.springboot.services.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// CustomerServiceImpl is a class that implements the CustomerService interface
@Service
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        super();
        this.customerRepository = customerRepository;
    }
    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerById(long id) {
        Optional<Customer> customer = customerRepository.findAllById(id);
        if (customer.isPresent()) {
            return customer.get();
        } else {
            throw new ResourceNotFoundException("customers", "id", id);
        }
    }

}
