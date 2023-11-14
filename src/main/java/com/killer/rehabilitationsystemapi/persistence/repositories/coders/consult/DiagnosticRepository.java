package com.killer.rehabilitationsystemapi.persistence.repositories.coders.consult;

import org.springframework.data.jpa.repository.JpaRepository;

import com.killer.rehabilitationsystemapi.domain.coders.consult.Diagnostic;

public interface DiagnosticRepository extends JpaRepository<Diagnostic, Long>{
    
}
