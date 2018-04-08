package com.example.airbnb.home;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface HomeService {
    void createHomeListing(Home home);

    Iterable<Home> getHomeListing();

    Page<Home> getPerPage(Pageable pageable);

    Home getIndividualHome(Integer id);
}
