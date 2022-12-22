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

    @Column(name = "CompanyName")
    private String CompanyName;

    @Column(name = "FullNameCompanyContact")
    private String FullNameCompanyContact;

    @Column(name = "CompanyContactPhone")
    private String CompanyContactPhone;

    @Column(name = "EmailCompanyContact")
    private String EmailCompanyContact;

    @Column(name = "CompanyDescription")
    private String CompanyDescription;

    @Column(name = "FullNameServiceTechnicalAuth")
    private String FullNameServiceTechnicalAuth;

    @Column(name = "TechnicalAuthorityPhoneService")
    private String TechnicalAuthorityPhoneService;

    @Column(name = "TechnicalManagerEmailService")
    private String TechnicalManagerEmailService;

    @Column(name = "created_at")
    private String created_at;

    @Column(name = "updated_at")
    private String updated_at;
}
