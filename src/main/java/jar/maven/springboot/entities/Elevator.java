package jar.maven.springboot.entities;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name="elevators")
public class Elevator {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)


    private long id;


    private Integer column_id;


    private Integer serialNumber;


    private String model;


    private String elevatorType;


    private String status;


    private String commissioningDate;


    private String lastInspection;


    private String inspectionCertificate;


    private String information;

    private String notes;


    private String created_at;


    private String updated_at;
}
