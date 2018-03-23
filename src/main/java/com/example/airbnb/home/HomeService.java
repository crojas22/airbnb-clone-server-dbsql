package com.example.airbnb.home;

import java.util.Optional;

public interface HomeService {
    void createHomeListing(Home home);

    Iterable<Home> getHomeListing();

    Home getIndividualHome(Integer id);
}
