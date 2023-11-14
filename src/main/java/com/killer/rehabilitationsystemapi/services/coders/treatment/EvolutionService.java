package com.killer.rehabilitationsystemapi.services.coders.treatment;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.killer.rehabilitationsystemapi.domain.coders.treatment.Evolution;
import com.killer.rehabilitationsystemapi.persistence.repositories.coders.treatment.EvolutionRepository;

@Service
public class EvolutionService {

    @Autowired
    private EvolutionRepository evolutionRepository;
    
    @Transactional
    public Evolution createEvolution(Evolution evolution) {

        return evolutionRepository.save(evolution);
        
    }

    @Transactional
    public Evolution updateEvolution(Evolution evolution) {

        return (evolutionRepository.existsById(evolution.getId()))?evolutionRepository.save(evolution): evolution;       
        
    }

    public List<Evolution> getAllEvolution() {
        return evolutionRepository.findAll();
    }

    public Evolution getEvolution(Evolution evolution) {
        return evolutionRepository.getReferenceById(evolution.getId());
    }
}
