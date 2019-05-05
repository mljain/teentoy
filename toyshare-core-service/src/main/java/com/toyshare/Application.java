package com.toyshare;

import com.toyshare.entity.Role;
import com.toyshare.entity.User;
import com.toyshare.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;

@SpringBootApplication
public class Application {

   /* @Bean
    public CommandLineRunner setupDefaultUser(UserService service) {
        return args -> {
            service.save(new User(
                    "user", //username
                    "user", //password
                    Arrays.asList(new Role("USER"), new Role("ACTUATOR")),//roles
                    true//Active
            ));
        };
    }*/

    @Bean
    public PasswordEncoder getPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}