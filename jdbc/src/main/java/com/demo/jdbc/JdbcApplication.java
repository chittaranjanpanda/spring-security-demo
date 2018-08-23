package com.demo.jdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(JdbcApplication.class, args);

       /* PasswordEncoder encoder = new BCryptPasswordEncoder(20);
        System.out.println(encoder.encode("admin"));*/
    }
}
