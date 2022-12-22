package jar.maven.springboot.services;

import jar.maven.springboot.entities.Elevator;


import java.util.List;

public interface ElevatorService {
    Elevator saveElevator(Elevator elevator);

    List<Elevator> getAllElevators();

    Elevator getElevatorById(long id);

}