package com.example.airbnb.experience;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin("*")
public interface ExperienceRepo extends PagingAndSortingRepository<Experience, Integer>{
    Page<Experience> findAll(Pageable pageable);
}
