package com.killer.rehabilitationsystemapi.services.coders.patient;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.killer.rehabilitationsystemapi.domain.coders.patient.ConsultPlan;
import com.killer.rehabilitationsystemapi.domain.entities.MedicalPerson;
import com.killer.rehabilitationsystemapi.persistence.repositories.coders.patient.ConsultPlanRepository;
import com.killer.rehabilitationsystemapi.services.MedicalPersonService;

@Service
public class ConsultPlanService {

    @Autowired
    private ConsultPlanRepository consultPlanRepository;
    @Autowired
    private MedicalPersonService doc;
    
    @Transactional
    public ConsultPlan createConsultPlan(ConsultPlan consultPlan) {

        return consultPlanRepository.save(consultPlan);
        
    }

    @Transactional
    public ConsultPlan updateConsultPlan(ConsultPlan consultPlan) {

        return (consultPlanRepository.existsById(consultPlan.getId()))?consultPlanRepository.save(consultPlan): consultPlan;       
        
    }

    public List<ConsultPlan> getAllConsultPlan() {
        return consultPlanRepository.findAll();
    }

    public ConsultPlan getConsultPlan(ConsultPlan consultPlan) {
        return consultPlanRepository.getReferenceById(consultPlan.getId());
    }

    public List<ConsultPlan> getAllByDoctor(Long doctorId){
        MedicalPerson doctor= doc.getMedicalById(doctorId);        
        return consultPlanRepository.findDoctor(doctor.getId());
    }
}
