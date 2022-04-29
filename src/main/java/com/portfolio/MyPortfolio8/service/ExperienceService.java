package com.portfolio.MyPortfolio8.service;

import com.portfolio.MyPortfolio8.model.Experience;
import com.portfolio.MyPortfolio8.repository.IExperienceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService implements IExperienceService {

    @Autowired
    public IExperienceRepository expRepo;
    
    @Override
    public void createExperience(Experience exp) {
        expRepo.save(exp);
    }

    @Override
    public List<Experience> seeListExperience() {
        return expRepo.findAll();
    }

    @Override
    public void deleteExperience(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public Experience findExperience(Long id) {
        return expRepo.findById(id).orElse(null);
    }

    @Override
    public Experience editExperience(Experience exp) {
        return expRepo.saveAndFlush(exp);
    }
    
}