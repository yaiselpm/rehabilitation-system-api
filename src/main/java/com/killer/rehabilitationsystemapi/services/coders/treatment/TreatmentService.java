package com.killer.rehabilitationsystemapi.services.coders.treatment;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.killer.rehabilitationsystemapi.domain.coders.treatment.Treatment;
import com.killer.rehabilitationsystemapi.persistence.repositories.coders.treatment.TreatmentRepository;

@Service
public class TreatmentService {

    @Autowired
    private TreatmentRepository treatmentRepository;
    
    @Transactional
    public Treatment createTreatment(Treatment treatment) {

        return treatmentRepository.save(treatment);
        
    }

    @Transactional
    public Treatment updateTreatment(Treatment treatment) {

        return (treatmentRepository.existsById(treatment.getId()))?treatmentRepository.save(treatment): treatment;       
        
    }

    public List<Treatment> getAllTreatment() {
        return treatmentRepository.findAll();
    }

    public Treatment getTreatment(Treatment treatment) {
        return treatmentRepository.getReferenceById(treatment.getId());
    }
}
