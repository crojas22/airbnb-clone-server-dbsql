package com.example.airbnb.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HomeServiceImpl implements HomeService {
    private final HomesRepo homesRepo;

    @Autowired
    public HomeServiceImpl(HomesRepo homesRepo) {
        this.homesRepo = homesRepo;
    }

    public void createHomeListing(Home home) {
        this.homesRepo.save(home);
    }

    public Iterable<Home> getHomeListing() {
        return this.homesRepo.findAll();
    }

    public Home getIndividualHome(Integer id) {
        return this.homesRepo.findOne(id) ;
    }
}
