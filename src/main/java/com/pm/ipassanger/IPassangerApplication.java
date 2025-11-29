package com.pm.ipassanger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class IPassangerApplication {

    public static void main(String[] args) {
        SpringApplication.run(IPassangerApplication.class, args);
    }

}
