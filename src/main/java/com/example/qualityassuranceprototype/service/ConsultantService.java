package com.example.qualityassuranceprototype.service;

import com.example.qualityassuranceprototype.repository.ConsultantRepository;
import com.example.qualityassuranceprototype.entity.Consultant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultantService {
    private final ConsultantRepository consultantRepository;

    public ConsultantService(ConsultantRepository consultantRepository) {
        this.consultantRepository = consultantRepository;
    }

    public List<Consultant> getAllConsultants() {
        return consultantRepository.findAll();
    }

    public Consultant getConsultantById(Long id) {
        return consultantRepository.getReferenceById(id);
    }

    /**
     * Adds a new consultant to the repository and returns the generated ID.
     * @param consultant
     * @return
     */
    public Long addConsultant(Consultant consultant) {
       return consultantRepository.saveAndFlush(consultant).getId();
    }
}
