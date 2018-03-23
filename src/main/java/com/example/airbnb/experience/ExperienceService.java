package com.example.airbnb.experience;

import java.util.Optional;

public interface ExperienceService {
    void createExperience(Experience experience);

    Iterable<Experience> getAllExperience();

    Experience getIndividualExperience(Integer id);
}
