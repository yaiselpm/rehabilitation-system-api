package com.killer.rehabilitationsystemapi.persistence.repositories.coders.treatment;

import org.springframework.data.jpa.repository.JpaRepository;

import com.killer.rehabilitationsystemapi.domain.coders.treatment.Evolution;

public interface EvolutionRepository extends JpaRepository<Evolution, Long>{
    
}
