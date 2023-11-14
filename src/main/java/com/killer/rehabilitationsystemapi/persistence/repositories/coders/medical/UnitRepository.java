package com.killer.rehabilitationsystemapi.persistence.repositories.coders.medical;

import org.springframework.data.jpa.repository.JpaRepository;

import com.killer.rehabilitationsystemapi.domain.coders.medical.Unit;

public interface UnitRepository extends JpaRepository<Unit, Long>{
    
}
