package com.killer.rehabilitationsystemapi.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.killer.rehabilitationsystemapi.domain.entities.Consult;

public interface ConsultRepository extends JpaRepository<Consult,Long>{
    
}
