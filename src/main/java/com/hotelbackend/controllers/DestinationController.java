package com.hotelbackend.controllers;


import com.hotelbackend.entities.Destination;
import com.hotelbackend.repositories.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//commenttset git
@RestController
@RequestMapping("destinations")
@CrossOrigin(origins = "*")
public class DestinationController {

    @Autowired
    DestinationRepository destinationRepo;

    @GetMapping("/bySaison")
    public List<Destination> getDestinationsBySeasons(@RequestParam String saison) {
        return destinationRepo.findBySaison(saison);
    }

    @GetMapping("/byBudget")
    public List<Destination> getDestinationsByBudget(@RequestParam long price) {
        return destinationRepo.findByPrice(price);
    }

}
