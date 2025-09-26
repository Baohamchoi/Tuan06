package iuh.fit.se.bai01;

import iuh.fit.se.bai01.beans.model.Group;
import iuh.fit.se.bai01.beans.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserService {
    @Bean
    public Group groupService() {
        return new Group(1, "Admin group");
    }

    public User userService() {
        return new User(1, "User 01", "123456",groupService());
    }
}
