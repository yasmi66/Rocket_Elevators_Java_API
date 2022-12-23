package jar.maven.springboot.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name="columns")
public class Column {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)


    private long id;


    private Integer battery_id;


    private String column_type;


    private String served_floor_nb;


    private String status;


    private String information;


    private String notes;


    private String created_at;


    private String updated_at;
}
