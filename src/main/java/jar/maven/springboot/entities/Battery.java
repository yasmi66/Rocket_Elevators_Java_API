package jar.maven.springboot.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
@Table(name="batteries")
public class Battery {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column (name="id")
    private long id;

    @Column(name = "building_id")
    private Integer building_id;

    @Column(name = "battery_type")
    private String battery_type;

    @Column(name = "status")
    private String status;

    @Column(name = "employee_id")
    private Long employee_id;

    @Column(name = "date_commissioning")
    private String date_commissioning;

    @Column(name = "date_last_inspection")
    private String date_last_inspection;

    @Column(name = "certificate_operations")
    private String certificate_operations;

    @Column(name = "information")
    private String information;

    @Column(name = "notes")
    private String notes;

    @Column(name = "created_at")
    private String created_at;

    @Column(name = "updated_at")
    private String updated_at;
}
