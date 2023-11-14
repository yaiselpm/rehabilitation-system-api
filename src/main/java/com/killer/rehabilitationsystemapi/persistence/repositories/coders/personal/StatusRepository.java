package com.killer.rehabilitationsystemapi.persistence.repositories.coders.personal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.killer.rehabilitationsystemapi.domain.coders.personal.Status;

public interface StatusRepository extends JpaRepository<Status, Long>{
    
}
