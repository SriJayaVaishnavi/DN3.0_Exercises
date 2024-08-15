package com.example.EmployeeManagementSystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
public class Auditor {

    @Bean
    public Auditor<String> auditorProvider() {
       
        return () -> java.util.Optional.of("system"); 
    }
}
