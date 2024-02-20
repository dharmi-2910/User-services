package com.example.userservice;

import com.example.userservice.external.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaServer
@EnableFeignClients
public class UserServiceApplication {

    @Autowired
    private RatingService ratingService;
    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

}
