package com.example.jetkinsheroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JetkinsherokuApplication {

    public static void main(String[] args) {
        SpringApplication.run(JetkinsherokuApplication.class, args);
    }


    @GetMapping
    public String get(){
        return "Hello Jetkins";
    }
}
