package jar.maven.springboot.services;

import jar.maven.springboot.entities.Customer;

import java.util.List;

public interface CustomerService {
    Customer saveCustomer(Customer customer);
    List<Customer> getAllCustomers();
    Customer getCustomerById(long id);

}
