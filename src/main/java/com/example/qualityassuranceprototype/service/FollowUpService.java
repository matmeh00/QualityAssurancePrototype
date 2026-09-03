package com.example.qualityassuranceprototype.service;

import com.example.qualityassuranceprototype.entity.FollowUp;
import com.example.qualityassuranceprototype.dto.FollowUpForm;
import com.example.qualityassuranceprototype.repository.FollowUpRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FollowUpService {
    private final FollowUpRepository followUpRepository;

    public FollowUpService(FollowUpRepository followUpRepository) {
        this.followUpRepository = followUpRepository;
    }

    public void createFollowUp(FollowUp followUp) {
        followUpRepository.save(followUp);
    }

    public void createFollowUp(FollowUpForm followUpForm) {
        followUpRepository.save(followUpForm.createFollowUp());
    }

    public List<FollowUp> getAllFollowUps() {
        return followUpRepository.findAll();
    }
}
