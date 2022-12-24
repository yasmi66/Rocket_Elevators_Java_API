package jar.maven.springboot.auth;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import jakarta.validation.constraints.Email;

@Getter
@Setter
public class AuthRequest {
    @NotNull
    @Email
    private String email;

    @NotNull
    private String password;
}