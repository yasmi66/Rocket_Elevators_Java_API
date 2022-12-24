package jar.maven.springboot.controllers;

import io.jsonwebtoken.Jwts;
import jakarta.validation.Valid;
import jar.maven.springboot.auth.AuthRequest;
import jar.maven.springboot.auth.AuthResponse;
import jar.maven.springboot.auth.JwtUtil;
import jar.maven.springboot.entities.User;
import jar.maven.springboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    AuthenticationManager authManager;
    @Autowired
    JwtUtil jwtUtil;
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/Authenticate", method = RequestMethod.POST)
    public ResponseEntity<?> authenticate(@RequestBody @Valid AuthRequest request) {
//        try {
//            Authentication authentication = authManager.authenticate(
//                    new UsernamePasswordAuthenticationToken(
//                            request.getEmail(), request.getPassword())
//            );
        User user = userRepository.findByEmail(request.getEmail()).orElse(null);
        if (user == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("User not found.");
        }
        // generate user token
        String token = jwtUtil.generateAccessToken(user);
        // return user token
        return ResponseEntity.ok(new AuthResponse(Jwts.parser().setSigningKey(JwtUtil.secret).parseClaimsJws(token).getBody().getSubject(), token));

    }
}
//            User user = (User) authentication.getPrincipal();
//            String accessToken = jwtUtil.generateAccessToken(user);
//            AuthResponse response = new AuthResponse(user.getEmail(), accessToken);
//            return ResponseEntity.ok().body(response);
//
//        } catch (BadCredentialsException e) {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
//        }


