package com.killer.rehabilitationsystemapi.persistence.repositories.coders.treatment;

import org.springframework.data.jpa.repository.JpaRepository;

import com.killer.rehabilitationsystemapi.domain.coders.treatment.TreatmentPlan;

public interface TreatmentPlanRepository extends JpaRepository<TreatmentPlan, Long>{
    
}
