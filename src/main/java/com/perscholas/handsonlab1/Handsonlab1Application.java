package com.perscholas.handsonlab1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Notice how we are using @SpringBootApplication as our primary application configuration class.
// Behind the scenes, that's equivalent to @Configuration, @EnableAutoConfiguration,
// and @ComponentScan together.

@SpringBootApplication
public class Handsonlab1Application {

    public static void main(String[] args) {
        SpringApplication.run(Handsonlab1Application.class, args);
    }

}
