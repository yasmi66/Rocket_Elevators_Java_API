package jar.maven.springboot.entities;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import jakarta.persistence.Id;
import java.util.Date;


@Data
@Entity
@Table(name="interventions")
public class Interventions {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)


    private long id;


    private String Author;


    private long CustomerID;


    private long BuildingID;


    private long BatteryID;


    private long ColumnID;


    private long ElevatorID;


    private String EmployeeID;


    private String StartDate;


    private String EndDate;


    private String Result;


    private String Report;


    private String Status;


    private String created_at;


    private String updated_at;
}
