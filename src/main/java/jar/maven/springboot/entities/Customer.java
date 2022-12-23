package jar.maven.springboot.entities;

import jakarta.persistence.*;
import lombok.Data;
import jakarta.persistence.Id;

@Data
@Entity
@Table(name="customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String CompanyName;


    private String FullNameCompanyContact;


    private String CompanyContactPhone;


    private String EmailCompanyContact;


    private String CompanyDescription;


    private String FullNameServiceTechnicalAuth;


    private String TechnicalAuthorityPhoneService;


    private String TechnicalManagerEmailService;


    private String created_at;


    private String updated_at;
}
