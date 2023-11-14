package com.killer.rehabilitationsystemapi.persistence.repositories.coders.consult;

import org.springframework.data.jpa.repository.JpaRepository;

import com.killer.rehabilitationsystemapi.domain.coders.consult.DiagnosticType;

public interface DiagnosticTypeRepository extends JpaRepository<DiagnosticType, Long>{
    
}
