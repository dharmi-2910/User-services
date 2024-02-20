package com.example.userservice.external.services;

import com.example.userservice.entities.Hotel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="HOTEL-SERVICES")
public interface HotelServices {
    @GetMapping("/hotels/{id}")
    Hotel getHotel(@PathVariable int id);

}

