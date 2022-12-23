package jar.maven.springboot.service.impl;

import jar.maven.springboot.exceptions.ResourceNotFoundException;
import jar.maven.springboot.entities.Battery;
import jar.maven.springboot.repositories.BatteryRepository;
import jar.maven.springboot.services.BatteryService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BatteryServiceImpl implements BatteryService {
    private BatteryRepository batteryRepository;

    public BatteryServiceImpl(BatteryRepository batteryRepository) {
        super();
        this.batteryRepository = batteryRepository;
    }

    @Override
    public Battery saveBattery(Battery battery) {
        return batteryRepository.save(battery);
    }

    @Override
    public List<Battery> getAllBatteries() {
        return batteryRepository.findAll();
    }

    @Override
    public Battery getBatteryById(long id) {
        Optional<Battery> battery = batteryRepository.findAllById(id);
        if (battery.isPresent()) {
            return battery.get();
        } else {
            throw new ResourceNotFoundException("batteries", "id", id);
        }
    }


}
