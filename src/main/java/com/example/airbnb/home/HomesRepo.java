package com.example.airbnb.home;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin("*")
public interface HomesRepo extends PagingAndSortingRepository<Home, Integer> {
    Page<Home> findAll(Pageable pageable);
}
