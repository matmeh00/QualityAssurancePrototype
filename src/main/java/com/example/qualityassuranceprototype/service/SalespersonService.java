package com.example.qualityassuranceprototype.service;

import com.example.qualityassuranceprototype.entity.Salesperson;
import com.example.qualityassuranceprototype.repository.SalespersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalespersonService {
    private final SalespersonRepository salespersonRepository;

    public SalespersonService(SalespersonRepository salespersonRepository) {
        this.salespersonRepository = salespersonRepository;
    }

    public void addSalesperson(Salesperson salesperson) {
        salespersonRepository.saveAndFlush(salesperson);
    }

    public Salesperson addSalesperson(String firstName, String lastName) {
        Salesperson salesperson = new Salesperson(firstName.trim(), lastName.trim());
        return salespersonRepository.saveAndFlush(salesperson);
    }

    public List<Salesperson> getAllSalespersons() {
        return salespersonRepository.findAll();
    }

    public Salesperson getSalespersonById(Long id) {
        return salespersonRepository.getReferenceById(id);
    }

}
