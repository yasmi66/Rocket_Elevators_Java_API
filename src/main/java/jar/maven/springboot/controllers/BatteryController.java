package jar.maven.springboot.controllers;

import jar.maven.springboot.entities.Battery;
import jar.maven.springboot.services.BatteryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/batteries")
public class BatteryController {

    private BatteryService batteryService;

    public BatteryController(BatteryService batteryService) {
        super();
        this.batteryService = batteryService;
    }

    // Get all batteries //
    //http://localhost:8080/api/batteries/all
    @GetMapping("/all")
    public List<Battery> getAllBatteries(){
        return batteryService.getAllBatteries();
    }

    // Get battery by id //
    //http://localhost:8080/api/batteries/1
    @GetMapping("{id}")
    public ResponseEntity<Battery> getBatteryById(@PathVariable ("id") long id){
        return new ResponseEntity<Battery>(batteryService.getBatteryById(id), HttpStatus.OK);
    }
}
