package com.example.airbnb.home;

import com.example.airbnb.location.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    @Override
    public Page<Home> getPerPage(Pageable pageable) {
        return this.homesRepo.findAll(pageable);
    }

    public Home getIndividualHome(Integer id) {
        return this.homesRepo.findOne(id) ;
    }

    @Override
    public void addHomeLocation(Integer id,Location location) {
        Home home = this.homesRepo.findOne(id);
        if (home.getLocation() == null) {
            home.setLocation(location);
            this.homesRepo.save(home);
        }
    }
}
