package jar.maven.springboot.controllers;

import jar.maven.springboot.entities.User;
import jar.maven.springboot.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        super();
        this.userService = userService;
    }

    // Get all users //
    //http://localhost:8080/api/users/all
    @GetMapping("/all")
    public List<User> getAllUsers(){

        return userService.getAllUsers();
    }

    // Get user by id //
    //http://localhost:8080/api/users/1
    @GetMapping("{id}")
    public ResponseEntity<User> getUserById(@PathVariable ("id") long id){
        return new ResponseEntity<User>(userService.getUserById(id), HttpStatus.OK);
    }

}