package com.killer.rehabilitationsystemapi.persistence.repositories.coders.patient;

import org.springframework.data.jpa.repository.JpaRepository;

import com.killer.rehabilitationsystemapi.domain.coders.patient.Reference;

public interface ReferenceRepository extends JpaRepository<Reference, Long>{
    
}
