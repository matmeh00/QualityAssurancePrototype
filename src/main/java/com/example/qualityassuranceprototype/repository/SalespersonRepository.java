package com.example.qualityassuranceprototype.repository;

import com.example.qualityassuranceprototype.entity.Salesperson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalespersonRepository extends JpaRepository<Salesperson, Long> {
}
