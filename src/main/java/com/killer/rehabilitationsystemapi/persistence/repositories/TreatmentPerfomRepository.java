package com.killer.rehabilitationsystemapi.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.killer.rehabilitationsystemapi.domain.entities.TreatmentsPerfom;

public interface TreatmentPerfomRepository extends JpaRepository<TreatmentsPerfom, Long> {
    
}
