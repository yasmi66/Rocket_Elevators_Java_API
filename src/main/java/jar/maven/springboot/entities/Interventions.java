package jar.maven.springboot.entities;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
@Table(name="interventions")
public class Interventions {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private int Author;
    private int CustomerID;
    private int BuildingID;
    private int BatteryID;
    private int ColumnID;
    private int ElevatorID;
    private int EmployeeID;
    private String StartDate;
    private String EndDate;
    private String Result;
    private String Report;
    private String Status;
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date createdAt;
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date updatedAt;
}

