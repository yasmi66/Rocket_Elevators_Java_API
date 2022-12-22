package jar.maven.springboot.controllers;

import jar.maven.springboot.entities.Elevator;
import jar.maven.springboot.services.ElevatorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/elevators")
public class ElevatorController {

    private ElevatorService elevatorService;

    public ElevatorController(ElevatorService elevatorService){
        super();
        this.elevatorService = elevatorService;
    }

    // Get all elevators //
    @GetMapping("/all")
    public List<Elevator> getAllElevators(){
        return elevatorService.getAllElevators();
    }

    // Get elevator by id //
    @GetMapping("{id}")
    public ResponseEntity<Elevator> getElevatorById(@PathVariable ("id") long id){
        return new ResponseEntity<Elevator>(elevatorService.getElevatorById(id), HttpStatus.OK);
    }
}
