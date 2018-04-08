package com.example.airbnb.experience;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ExperienceServiceImpl implements ExperienceService{
    private final ExperienceRepo experienceRepo;

    @Autowired
    public ExperienceServiceImpl(ExperienceRepo experienceRepo) {
        this.experienceRepo = experienceRepo;
    }

    @Override
    public void createExperience(Experience experience) {
        this.experienceRepo.save(experience);
    }

    @Override
    public Iterable<Experience> getAllExperience() {
        return this.experienceRepo.findAll();
    }

    @Override
    public Page<Experience> getPerPage(Pageable pageable) {
        return this.experienceRepo.findAll(pageable);
    }

    @Override
    public Experience getIndividualExperience(Integer id) {
        return this.experienceRepo.findOne(id);
    }
}
