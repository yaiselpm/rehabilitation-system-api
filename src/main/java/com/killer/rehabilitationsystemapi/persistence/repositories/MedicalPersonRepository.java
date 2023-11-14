package com.killer.rehabilitationsystemapi.persistence.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.killer.rehabilitationsystemapi.domain.entities.MedicalPerson;
// import java.util.List;


public interface MedicalPersonRepository extends JpaRepository<MedicalPerson,Long>{
    
    public MedicalPerson findByIdNumber(Long idNumber);
}
