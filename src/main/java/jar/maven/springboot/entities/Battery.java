package jar.maven.springboot.entities;

import jakarta.persistence.*;
import lombok.Data;
import jakarta.persistence.Id;
//import java.util.List;

@Data
@Entity
@Table(name="batteries")
public class Battery {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)


    private long id;
    private Long building_id;

    private String battery_type;


    private String status;


    private Long employee_id;


    private String date_commissioning;


    private String date_last_inspection;


    private String certificate_operations;


    private String information;


    private String notes;


    private String created_at;


    private String updated_at;
}
