package com.killer.rehabilitationsystemapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import org.springframework.web.reactive.function.client.WebClient;

import com.killer.rehabilitationsystemapi.domain.entities.Patient;

import reactor.core.publisher.Flux;

@Configuration
// @EnableWebFlux
public class WebFluxConfig{

    WebClient client= WebClient.create("http://localhost:8080");

    public void consume(){
        Flux<Patient> patientFlux = client.get()
            .uri("/patients/patient")
            .retrieve()
            .bodyToFlux(Patient.class);

            patientFlux.subscribe();            
    }
}
