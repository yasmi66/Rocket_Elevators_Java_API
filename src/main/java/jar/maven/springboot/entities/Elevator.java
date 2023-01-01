package jar.maven.springboot.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="elevators")
public class Elevator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private Integer column_id;
    private Integer serial_nb;

    private String model;

    private String elevator_type;

    private String elevator_status;

    private String date_commissioning;

    private String date_last_inspection;

    private String certificate_inspection;

    private String information;

    private String notes;
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date createdAt;
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date updatedAt;
}
