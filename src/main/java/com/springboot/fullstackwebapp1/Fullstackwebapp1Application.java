package com.springboot.fullstackwebapp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Fullstackwebapp1Application {

    public static void main(String[] args) {
        SpringApplication.run(Fullstackwebapp1Application.class, args);
    }

}
