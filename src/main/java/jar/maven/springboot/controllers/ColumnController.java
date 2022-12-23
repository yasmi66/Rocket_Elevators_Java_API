package jar.maven.springboot.controllers;

import jar.maven.springboot.entities.Column;
import jar.maven.springboot.entities.Elevator;
import jar.maven.springboot.services.ColumnService;
import jar.maven.springboot.services.ElevatorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/columns")
public class ColumnController {
    private ColumnService columnService;

    public ColumnController(ColumnService columnService) {
        super();
        this.columnService = columnService;
    }


    // Get all columns //
    @GetMapping("/all")
    public List<Column> getAllColumns() {
        return columnService.getAllColumns();
    }

    // Get columns by id //
    //http://localhost:8080/api/columns/1
    @GetMapping("{id}")
    public ResponseEntity<Column> getColumnById(@PathVariable("id") long id) {
        return new ResponseEntity<Column>(columnService.getColumnById(id), HttpStatus.OK);
    }
}
