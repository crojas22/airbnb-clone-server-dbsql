package com.example.airbnb.experience;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ExperienceService {
    void createExperience(Experience experience);

    Iterable<Experience> getAllExperience();

    Page<Experience> getPerPage(Pageable pageable);

    Experience getIndividualExperience(Integer id);
}
