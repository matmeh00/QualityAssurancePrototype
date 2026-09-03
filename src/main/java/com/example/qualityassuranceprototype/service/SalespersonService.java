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

    public Salesperson addSalesperson(Salesperson salesperson) {
        return salespersonRepository.saveAndFlush(salesperson);
    }


    public List<Salesperson> getAllSalesPeople() {
        return salespersonRepository.findAll();
    }

    public Salesperson getSalespersonById(Long id) {
        return salespersonRepository.getReferenceById(id);
    }

    public void deleteSalespersonById(Long id) {
        salespersonRepository.deleteById(id);
    }

    public void deleteAllSalespersons() {
        salespersonRepository.deleteAll();
    }

}
