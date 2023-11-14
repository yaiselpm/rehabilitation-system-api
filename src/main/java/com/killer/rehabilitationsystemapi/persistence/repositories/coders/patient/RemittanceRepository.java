package com.killer.rehabilitationsystemapi.persistence.repositories.coders.patient;

import org.springframework.data.jpa.repository.JpaRepository;

import com.killer.rehabilitationsystemapi.domain.coders.patient.Remittance;

public interface RemittanceRepository extends JpaRepository<Remittance, Long>{
    
}
