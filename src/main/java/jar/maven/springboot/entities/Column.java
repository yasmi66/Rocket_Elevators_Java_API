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

    @Column(name="id")
    private long id;

    @Column(name = "battery_id")
    private Integer battery_id;

    @Column(name = "column_type")
    private String column_type;

    @Column(name = "served_floor_nb")
    private String served_floor_nb;

    @Column(name = "status")
    private String status;

    @Column(name = "information")
    private String information;

    @Column(name = "notes")
    private String notes;

    @Column(name = "created_at")
    private String created_at;

    @Column(name = "updated_at")
    private String updated_at;
}
