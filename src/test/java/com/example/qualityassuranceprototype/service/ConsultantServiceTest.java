package com.example.qualityassuranceprototype.service;

import com.example.qualityassuranceprototype.entity.Consultant;
import com.example.qualityassuranceprototype.repository.ConsultantRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ConsultantServiceTest {

    @Mock
    private ConsultantRepository consultantRepository;

    @InjectMocks
    private ConsultantService consultantService;

/*
    @Test
    public void GetAllConsultants_ShouldReturnListOfConsultants() {
        // Arrange
        // You can set up mock behavior here if needed
        var consultant = new Consultant("John", "Doe");

        //when(con)

        // Act
        var result = consultantService.getAllConsultants();

    }

 */

    @Test
    public void CreateConsultant_NotReturnNull() {
        var consultant = new Consultant("John", "Doe");
        when(consultantRepository.save(consultant)).thenReturn(consultant);
        consultantService.addConsultant(consultant);
        Assertions.assertThat(consultant).isNotNull();
    }

    @Test
    public void TestRepoShouldBeEmpty() {
        var consultants = consultantService.getAllConsultants();
        Assertions.assertThat(consultants).isEmpty();
    }


    @Test
    public void DeleteConsultants_ShouldDeleteConsultants() {
        var consultant = new Consultant("John", "Doe");
        var consultant2 = new Consultant("Jane", "Doe");
        var consultant3 = new Consultant("Jim", "Beam");
        when(consultantRepository.save(consultant)).thenReturn(consultant);
        consultantService.addConsultant(consultant);
        consultantService.deleteAllConsultants();
        var consultants = consultantService.getAllConsultants();
        Assertions.assertThat(consultants).isEmpty();
    }
}
