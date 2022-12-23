package jar.maven.springboot.service.impl;

import jar.maven.springboot.exceptions.ResourceNotFoundException;
import jar.maven.springboot.entities.Building;
import jar.maven.springboot.repositories.BuildingRepository;
import jar.maven.springboot.services.BuildingService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BuildingServiceImpl implements BuildingService {
    private BuildingRepository buildingRepository;

    public BuildingServiceImpl(BuildingRepository buildingRepository) {
        super();
        this.buildingRepository = buildingRepository;
    }

    @Override
    public Building saveBuilding(Building building) {
        return buildingRepository.save(building);
    }

    @Override
    public List<Building> getAllBuildings() {
        return buildingRepository.findAll();
    }

    @Override
    public Building getBuildingById(long id) {
        Optional<Building> building = buildingRepository.findAllById(id);
        if (building.isPresent()) {
            return building.get();
        } else {
            throw new ResourceNotFoundException("buildings", "id", id);
        }
    }
}
