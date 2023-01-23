package com.hotelbackend.controllers;


import com.hotelbackend.entities.Hotel;
import com.hotelbackend.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("hotels")
@CrossOrigin(origins = "*")
public class HotelController {

    @Autowired
    HotelRepository hotelRepository;

    @GetMapping("/byStars")
    public List<Hotel> getHotelsByStars(@RequestParam int stars,@RequestParam String location) {
        return hotelRepository.findByStarsAndLocation(stars, location);
    }

    @GetMapping("/bySaison")
    public List<Hotel> getHotelsBySeasons(@RequestParam String saison,@RequestParam String location) {
        return hotelRepository.findBySaisonAndLocation(saison, location);
    }

    @GetMapping("/byBudget")
    public List<Hotel> getHotelsByBudget(@RequestParam long price,@RequestParam String location) {
        return hotelRepository.findByPriceAndLocation(price, location);
    }

}
