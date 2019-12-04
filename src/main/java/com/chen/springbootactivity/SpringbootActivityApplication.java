package com.chen.springbootactivity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {org.activiti.spring.boot.SecurityAutoConfiguration.class})
public class SpringbootActivityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootActivityApplication.class, args);
    }

}
