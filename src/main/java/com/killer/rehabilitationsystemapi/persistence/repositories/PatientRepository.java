package com.killer.rehabilitationsystemapi.persistence.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.killer.rehabilitationsystemapi.domain.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long>{
    
    public List<Patient> findByName(String name);

    public List<Patient> findDistinctByNameOrIdNumberOrClinicHistoryIsAllIgnoreCase(String name, Long idNumber, Long clinicHistory);
   
}
