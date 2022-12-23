package jar.maven.springboot.service.impl;

import jar.maven.springboot.exceptions.ResourceNotFoundException;
import jar.maven.springboot.entities.Interventions;
import jar.maven.springboot.repositories.InterventionsRepository;
import jar.maven.springboot.services.InterventionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class InterventionsServiceImpl implements InterventionsService {

    private InterventionsRepository interventionsRepository;

    @Autowired
    public InterventionsServiceImpl(InterventionsRepository interventionsRepository) {
        super();
        this.interventionsRepository = interventionsRepository;
    }

    @Override
    public Interventions saveInterventions(Interventions interventions) {
        return interventionsRepository.save(interventions);
    }

    @Override
    public List<Interventions> getAllInterventions() {
        return interventionsRepository.findAll();
    }

    @Override
    public Interventions getInterventionById(long id) {
        Optional<Interventions> interventions = interventionsRepository.findAllById(id);
        if (interventions.isPresent()) {
            return interventions.get();
        } else {
            throw new ResourceNotFoundException("interventions", "id", id);
        }
    }

    //@Override
    public Interventions updatedIntervention(Interventions interventions, long id) {
        // check if intervention with id exists
        Interventions existingInterventions = interventionsRepository.findAllById(id).orElseThrow(
                () -> new ResourceNotFoundException("Intervention", "Id", id));
        existingInterventions.setBuildingID(interventions.getBuildingID());
        existingInterventions.setBatteryID(interventions.getBatteryID());
        existingInterventions.setColumnID(interventions.getColumnID());
        existingInterventions.setElevatorID(interventions.getElevatorID());
        existingInterventions.setReport(interventions.getReport());
        //save existing intervention
        interventionsRepository.save(existingInterventions);
        return existingInterventions;
    }

    @Override
    public void deleteIntervention(long id) {
        //id validation check
        interventionsRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Intervention", "Id", id));
        interventionsRepository.deleteById(id);
    }
}
