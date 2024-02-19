package com.example.userservice.external.services;

import com.example.userservice.entities.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Service
@FeignClient(name="RATING-SERVICE")
public interface RatingService {

    @PostMapping("/ratings")
    public Rating createRating(Rating values);

    @PutMapping("/ratings/{id}")
    public Rating updateRating(@PathVariable("id")int id, Rating rating);

    @DeleteMapping("/ratings/{id}")
    public void deleteRating(@PathVariable int id);
}
