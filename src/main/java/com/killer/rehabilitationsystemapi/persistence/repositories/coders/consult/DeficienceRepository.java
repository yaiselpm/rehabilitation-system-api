package com.killer.rehabilitationsystemapi.persistence.repositories.coders.consult;

import org.springframework.data.jpa.repository.JpaRepository;

import com.killer.rehabilitationsystemapi.domain.coders.consult.Deficience;

public interface DeficienceRepository extends JpaRepository<Deficience, Long>{
    
}
