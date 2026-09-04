package com.example.qualityassuranceprototype;

import com.example.qualityassuranceprototype.entity.Consultant;
import com.example.qualityassuranceprototype.repository.ConsultantRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;


@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class ConsultantRepositoryTest {

    @Autowired
    private ConsultantRepository consultantRepository;

     @Test
    public void ConsultantRepository_GetConsultants_ShouldBeEmpty() {

        var consultants = consultantRepository.findAll();

        Assertions.assertThat(consultants).isEmpty();
    }

    @Test
    public void AddConsultant_ShouldBeAdded() {
        consultantRepository.saveAndFlush(new Consultant("John", "Doe"));
        var consultants = consultantRepository.findAll();
        Assertions.assertThat(consultants).hasSize(1);
    }

    @Test
    public void GetConsultantById_ShouldReturnConsultant() {
        var consultant = consultantRepository.saveAndFlush(new Consultant("Jane", "Doe"));
        var foundConsultant = consultantRepository.getReferenceById(consultant.getId());
        Assertions.assertThat(foundConsultant).isNotNull();
        Assertions.assertThat(foundConsultant.getFirstName()).isEqualTo("Jane");
        Assertions.assertThat(foundConsultant.getLastName()).isEqualTo("Doe");
        Assertions.assertThat(consultant.equals(foundConsultant)).isTrue();
    }
}

