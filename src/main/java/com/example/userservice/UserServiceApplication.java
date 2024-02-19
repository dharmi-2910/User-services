package com.example.userservice;

import com.example.userservice.entities.Rating;
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

    void contextLoad(){
    }

    @Autowired
    private RatingService ratingService;

//    @Test
//    void createRating(){
//       Rating rating = Rating.builder().rating(String.valueOf(7)).userId(1).hotel(1).feedback("this is created using feign client").build();
//        Rating ratingResponseEntity = ratingService.createRating(rating);
//        ratingResponseEntity.
//           System.out.println("new rating created");
//    }
    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

}
