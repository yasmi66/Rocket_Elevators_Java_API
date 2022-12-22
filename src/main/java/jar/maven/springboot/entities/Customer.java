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

    @Column(name = "CompanyName", nullable = false)
    private String CompanyName;

    @Column(name = "FullNameCompanyContact", nullable = false)
    private String FullNameCompanyContact;

    @Column(name = "CompanyContactPhone", nullable = false)
    private String CompanyContactPhone;

    @Column(name = "EmailCompanyContact", nullable = false)
    private String EmailCompanyContact;

    @Column(name = "CompanyDescription", nullable = false)
    private String CompanyDescription;

    @Column(name = "FullNameServiceTechnicalAuth", nullable = false)
    private String FullNameServiceTechnicalAuth;

    @Column(name = "TechnicalAuthorityPhoneService", nullable = false)
    private String TechnicalAuthorityPhoneService;

    @Column(name = "TechnicalManagerEmailService", nullable = false)
    private String TechnicalManagerEmailService;

    @Column(name = "created_at")
    private String created_at;

    @Column(name = "updated_at")
    private String updated_at;
}
