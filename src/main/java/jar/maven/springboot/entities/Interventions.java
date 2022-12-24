package jar.maven.springboot.entities;

import jakarta.persistence.*;
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

    private String created_at;
    private String updated_at;
}

