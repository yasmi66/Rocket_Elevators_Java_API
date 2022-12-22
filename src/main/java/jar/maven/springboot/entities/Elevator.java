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

    @Column (name="id")
    private long id;

    @Column(name = "column_id")
    private Integer column_id;

    @Column(name = "serial_nb")
    private Integer serialNumber;

    @Column(name = "model")
    private String model;

    @Column(name = "elevator_type")
    private String elevatorType;

    @Column(name = "elevator_status")
    private String status;

    @Column(name = "date_commissioning")
    private String commissioningDate;

    @Column(name = "date_last_inspection")
    private String lastInspection;

    @Column(name = "certificate_inspection")
    private String inspectionCertificate;

    @Column(name = "information")
    private String information;
    @Column(name = "notes")
    private String notes;

    @Column(name = "created_at")
    private String created_at;

    @Column(name = "updated_at")
    private String updated_at;
}
