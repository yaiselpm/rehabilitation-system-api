package com.killer.rehabilitationsystemapi.persistence.repositories.coders.patient;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.killer.rehabilitationsystemapi.domain.coders.patient.ConsultPlan;
import com.killer.rehabilitationsystemapi.domain.entities.MedicalPerson;

public interface ConsultPlanRepository extends JpaRepository<ConsultPlan, Long>{

    // @Query("SELECT * FROM ConsultPlan WHERE doctorId = :doctor")
    public List<ConsultPlan> findByDoctor(MedicalPerson doctor);

    @Query(value = "SELECT * FROM consult_plan WHERE doctor_doctor_id = :doctor", nativeQuery=true)
    public List<ConsultPlan> findDoctor(Long doctor);
    
}
