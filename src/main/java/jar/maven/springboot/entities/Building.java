package jar.maven.springboot.entities;

import jakarta.persistence.*;
import lombok.Data;
import jakarta.persistence.Id;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name="buildings")
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;


    private Integer customer_id;


    private String addressBuilding;


    private String FullNameBuildingAdmin;


    private String EmailAdminBuilding;


    private String PhoneNumberBuildingAdmin;


    private String FullNameTechContact;


    private String TechContactEmail;


    private String TechContactPhone;


    private String created_at;


    private String updated_at;
}
