package jar.maven.springboot.services;

import jar.maven.springboot.entities.Building;
import java.util.List;

public interface BuildingService {
    Building saveBuilding(Building building);

    List<Building> getAllBuildings();
    Building getBuildingById(long id);
}
