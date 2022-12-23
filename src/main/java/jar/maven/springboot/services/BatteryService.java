package jar.maven.springboot.services;

import jar.maven.springboot.entities.Battery;
import java.util.List;

public interface BatteryService {
    Battery saveBattery(Battery battery);

    List<Battery> getAllBatteries();

    Battery getBatteryById(long id);
}
