package com.example.qualityassuranceprototype.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import com.example.qualityassuranceprototype.service.ConsultantService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import tools.jackson.databind.ObjectMapper;

/*
@AutoConfigureMockMvc(addFilters = false)
@WebMvcTest(ConsultantsController.class)
@ExtendWith(MockitoExtension.class)
public class ConsultantsControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    ConsultantService consultantService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void CreateConsultant_ShouldReturnOk() throws Exception {
        mockMvc.perform(get("/consultants"))
                .andExpect(status().isOk())
                .andExpect(view().name("consultants"));
    }

}


 */