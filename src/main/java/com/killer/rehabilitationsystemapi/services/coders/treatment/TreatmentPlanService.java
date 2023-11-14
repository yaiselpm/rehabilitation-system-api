package com.killer.rehabilitationsystemapi.services.coders.treatment;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.killer.rehabilitationsystemapi.domain.coders.treatment.TreatmentPlan;
import com.killer.rehabilitationsystemapi.persistence.repositories.coders.treatment.TreatmentPlanRepository;

@Service
public class TreatmentPlanService {

    @Autowired
    private TreatmentPlanRepository treatmentPlanRepository;
    
    @Transactional
    public TreatmentPlan createTreatmentPlan(TreatmentPlan treatmentPlan) {

        return treatmentPlanRepository.save(treatmentPlan);
        
    }

    @Transactional
    public TreatmentPlan updateTreatmentPlan(TreatmentPlan treatmentPlan) {

        return (treatmentPlanRepository.existsById(treatmentPlan.getId()))?treatmentPlanRepository.save(treatmentPlan): treatmentPlan;       
        
    }

    public List<TreatmentPlan> getAllTreatmentPlan() {
        return treatmentPlanRepository.findAll();
    }

    public TreatmentPlan getTreatmentPlan(TreatmentPlan treatmentPlan) {
        return treatmentPlanRepository.getReferenceById(treatmentPlan.getId());
    }
}
