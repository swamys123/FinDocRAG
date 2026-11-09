package com.findoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class FindocRagApplication {
    public static void main(String[] args) {
        SpringApplication.run(FindocRagApplication.class, args);
    }
}
