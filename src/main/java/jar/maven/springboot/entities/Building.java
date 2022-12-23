package jar.maven.springboot.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name="buildings")
public class Building {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column (name="id")
    private long id;

    @Column(name = "customer_id")
    private Integer customer_id;

    @Column(name = "addressBuilding")
    private String addressBuilding;

    @Column(name = "FullNameBuildingAdmin")
    private String FullNameBuildingAdmin;

    @Column(name = "EmailAdminBuilding")
    private String EmailAdminBuilding;

    @Column(name = "PhoneNumberBuildingAdmin")
    private String PhoneNumberBuildingAdmin;

    @Column(name = "FullNameTechContact")
    private String FullNameTechContact;

    @Column(name = "TechContactEmail")
    private String TechContactEmail;

    @Column(name = "TechContactPhone")
    private String TechContactPhone;

    @Column(name = "created_at")
    private String created_at;

    @Column(name = "updated_at")
    private String updated_at;
}
