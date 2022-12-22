package jar.maven.springboot.services;

import jar.maven.springboot.entities.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    List<User> getAllUsers();

    User getUserById(long id);

}
