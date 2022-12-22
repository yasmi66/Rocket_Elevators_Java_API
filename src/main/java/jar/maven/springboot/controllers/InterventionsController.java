package jar.maven.springboot.controllers;

import jar.maven.springboot.entities.Interventions;
import jar.maven.springboot.services.InterventionsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/interventions")
public class InterventionsController {

    private InterventionsService interventionsService;

    public InterventionsController(InterventionsService interventionsService) {
        super();
        this.interventionsService = interventionsService;
    }

    // Create new intervention //
    @PostMapping(value="new")
    public ResponseEntity<Interventions> saveInterventions(@RequestBody Interventions interventions){
        return new ResponseEntity<Interventions>(interventionsService.saveInterventions(interventions), HttpStatus.CREATED);
    }

    // Get all interventions //
    @GetMapping()
    public List<Interventions> getAllInterventions(){
        return interventionsService.getAllInterventions();
    }

    // Get intervention by id //
    //http://localhost:8080/api/interventions/1
    @GetMapping("{id}")
    public ResponseEntity<Interventions> getInterventionById(@PathVariable ("id") long id){
        return new ResponseEntity<Interventions>(interventionsService.getInterventionById(id), HttpStatus.OK);
    }

    // Update intervention //
    //http://localhost:8080/api/interventions/update/1
//    @PatchMapping(value="update/{id}")
//    public ResponseEntity<Interventions> updateInterventions(@PathVariable ("id") long id, @RequestBody Interventions interventions){
//        return new ResponseEntity<Interventions>(interventionsService.updatedIntervention(interventions, id), HttpStatus.OK);
//    }

    // Delete intervention //
    //http://localhost:8080/api/interventions/delete/1

    @DeleteMapping(value="delete/{id}")
    public ResponseEntity<String> deleteIntervention(@PathVariable("id") long id){
        interventionsService.deleteIntervention(id);
        return new ResponseEntity<String>("Intervention Deleted", HttpStatus.OK);
    }
}
