package jar.maven.springboot.services;

import jar.maven.springboot.entities.Interventions;
import java.util.List;

public interface InterventionsService {
    Interventions saveInterventions(Interventions interventions);
    List<Interventions> getAllInterventions();
    Interventions getInterventionById(long id);
    Interventions updatedIntervention(Interventions interventions, long id);
    void deleteIntervention(long id);
}
