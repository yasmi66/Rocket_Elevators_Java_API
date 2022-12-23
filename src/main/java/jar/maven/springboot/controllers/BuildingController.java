package jar.maven.springboot.controllers;

import jar.maven.springboot.entities.Building;
import jar.maven.springboot.services.BuildingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping ("/api/buildings")
public class BuildingController {

    private BuildingService buildingService;

    public BuildingController(BuildingService buildingService) {
        super();
        this.buildingService = buildingService;
    }

    // Get all buildings //
    @GetMapping("/all")
    public List<Building> getAllBuildings() {
        return buildingService.getAllBuildings();
    }

    // Get building by id //
    @GetMapping("{id}")
    public ResponseEntity<Building> getBuildingById(@PathVariable ("id") long id) {
        return new ResponseEntity<Building>(buildingService.getBuildingById(id), HttpStatus.OK);
    }
}
