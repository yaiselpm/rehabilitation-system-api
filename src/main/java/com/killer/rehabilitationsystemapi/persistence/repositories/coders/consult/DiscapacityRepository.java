package com.killer.rehabilitationsystemapi.persistence.repositories.coders.consult;

import org.springframework.data.jpa.repository.JpaRepository;

import com.killer.rehabilitationsystemapi.domain.coders.consult.Discapacity;

public interface DiscapacityRepository extends JpaRepository<Discapacity, Long>{
    
}
