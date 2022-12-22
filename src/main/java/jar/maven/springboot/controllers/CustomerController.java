package jar.maven.springboot.controllers;

import jar.maven.springboot.entities.Customer;
import jar.maven.springboot.services.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {

        super();
        this.customerService = customerService;
    }
    // Get all customers //
    @GetMapping ("/all")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    // this is a test endpoint path for postman //
    @GetMapping ("/test")
    public String testCustomer(){
        return "test customer";
    }

    // Get customer by id //
    @GetMapping("{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable ("id") long id){
        return new ResponseEntity<Customer>(customerService.getCustomerById(id), HttpStatus.OK);
    }

    // Create new customer //
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
        return new ResponseEntity<Customer>(customerService.saveCustomer(customer), HttpStatus.CREATED);
    }
}
