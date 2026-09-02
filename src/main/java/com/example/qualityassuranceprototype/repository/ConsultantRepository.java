package com.example.qualityassuranceprototype.repository;

import com.example.qualityassuranceprototype.entity.Consultant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultantRepository extends JpaRepository<Consultant, Long> {
}
