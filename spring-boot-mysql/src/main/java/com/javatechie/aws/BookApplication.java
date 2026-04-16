package com.javatechie.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class BookApplication {



    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class, args);
    }

}
