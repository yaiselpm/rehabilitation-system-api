package com.killer.rehabilitationsystemapi.persistence.repositories.coders.personal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.killer.rehabilitationsystemapi.domain.coders.personal.BloodGroup;

public interface BloodGroupRepository extends JpaRepository<BloodGroup, Long>{
    
}
