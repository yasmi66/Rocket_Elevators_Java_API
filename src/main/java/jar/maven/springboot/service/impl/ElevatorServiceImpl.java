package jar.maven.springboot.service.impl;

import jar.maven.springboot.exceptions.ResourceNotFoundException;
import jar.maven.springboot.entities.Elevator;
import jar.maven.springboot.repositories.ElevatorRepository;
import jar.maven.springboot.services.ElevatorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ElevatorServiceImpl implements ElevatorService {
    private ElevatorRepository elevatorRepository;

    public ElevatorServiceImpl(ElevatorRepository elevatorRepository) {
        super();
        this.elevatorRepository = elevatorRepository;
    }

    @Override
    public Elevator saveElevator(Elevator elevator) {
        return elevatorRepository.save(elevator);
    }

    @Override
    public List<Elevator> getAllElevators() {
        return elevatorRepository.findAll();
    }

    @Override
    public Elevator getElevatorById(long id) {
        Optional<Elevator> elevator = elevatorRepository.findAllById(id);
        if (elevator.isPresent()) {
            return elevator.get();
        } else {
            throw new ResourceNotFoundException("elevators", "id", id);
        }
    }
}
