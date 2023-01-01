package jar.maven.springboot.entities;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
@Table(name="columns")
public class Column {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private Long battery_id;
    private String column_type;
    private Integer served_floor_nb;
    private String status;
    private String information;
    private String notes;
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date createdAt;
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date updatedAt;
}
