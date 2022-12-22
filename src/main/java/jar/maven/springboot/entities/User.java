package jar.maven.springboot.entities;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name="users")
public class User {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column (name="id")
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "firstName")
    private String first_name;

    @Column(name = "lastName")
    private String last_name;

    @Column(name = "email")
    private String email;

    @Column(name = "encrypted_password")
    private String encrypted_password;

    @Column(name = "created_at")
    private String created_at;

    @Column(name = "updated_at")
    private String updated_at;

}
