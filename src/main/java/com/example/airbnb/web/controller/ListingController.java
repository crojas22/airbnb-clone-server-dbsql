package com.example.airbnb.web.controller;

import com.example.airbnb.experience.ExperienceService;
import com.example.airbnb.home.HomeService;
import com.example.airbnb.location.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path = "/api/v1")
public class ListingController {
    private final HomeService homeService;
    private final ExperienceService experienceService;

    @Autowired
    public ListingController(HomeService homeService,
                             ExperienceService experienceService) {
        this.homeService = homeService;
        this.experienceService = experienceService;
    }

    @RequestMapping(value = "/homepage", method = RequestMethod.GET)
    public ResponseEntity<Map<String, Object>> getHomeData() {
        Map<String, Object> responseBody = new HashMap<>();
        try {
            responseBody.put("homeListing", this.homeService.getPerPage(new PageRequest(0, 8)));
            responseBody.put("experienceListing", this.experienceService.getPerPage(new PageRequest(0, 8)));
            return new ResponseEntity<>(responseBody, HttpStatus.OK);
        } catch (Exception e) {
            responseBody.put("error", e);
            return new ResponseEntity<>(responseBody, HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "/search/homes", method = RequestMethod.GET)
    public ResponseEntity searchHomeData() {
        try {
            return new ResponseEntity<>(this.homeService.getPerPage(new PageRequest(0,12)), HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
        }
    }

    @RequestMapping(value = "/home/{id}", method = RequestMethod.GET)
    public ResponseEntity<Map<String, Object>> getIndividualHome(@PathVariable Integer id) {
        Map<String, Object> responseBody = new HashMap<>();
        try {
            responseBody.put("listing", this.homeService.getIndividualHome(id));
            return new ResponseEntity<>(responseBody, HttpStatus.OK);
        } catch (Exception e) {
            responseBody.put("error", e);
            return new ResponseEntity<>(responseBody, HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "/home/location/{id}", method = RequestMethod.POST)
    public ResponseEntity addHomeLocation(@PathVariable Integer id,
                                          @RequestBody Location location) {
        try {
            this.homeService.addHomeLocation(id,location);
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .build();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e);
        }
    }

    @RequestMapping(value = "/experience/{id}", method = RequestMethod.GET)
    public ResponseEntity<Map<String, Object>> getIndividualExperience(@PathVariable Integer id) {
        Map<String, Object> responseBody = new HashMap<>();
        try {
            responseBody.put("listing", this.experienceService.getIndividualExperience(id));
            return new ResponseEntity<>(responseBody, HttpStatus.OK);
        } catch (Exception e) {
            responseBody.put("error", e);
            return new ResponseEntity<>(responseBody, HttpStatus.BAD_REQUEST);
        }
    }
}
