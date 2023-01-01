package jar.maven.springboot.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int user_id;

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
