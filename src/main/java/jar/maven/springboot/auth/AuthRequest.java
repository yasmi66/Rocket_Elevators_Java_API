package jar.maven.springboot.auth;

import lombok.Getter;
import lombok.Setter;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;


@Getter
@Setter
public class AuthRequest {
    @NotNull
    @Email
    private String email;

    @NotNull
    private String password;

}