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

    // this is a test endpoint path for postman -- done w. Felicia's help//
    @GetMapping ("/test")
    public String testCustomer(){
        return "test customer";
    }

    // Get all customers //
    //http://localhost:8080/api/customers/all
    @GetMapping ("/all")
    public List<Customer> getAllCustomers(){

        return customerService.getAllCustomers();
    }

    // Get customer by id //
    //http://localhost:8080/api/customers/1
    @GetMapping("{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable ("id") long id){
        return new ResponseEntity<Customer>(customerService.getCustomerById(id), HttpStatus.OK);
    }

    // Create new customer //
    //http://localhost:8080/api/customers/new
    @PostMapping(value="new")
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
        return new ResponseEntity<Customer>(customerService.saveCustomer(customer), HttpStatus.CREATED);
    }
}
