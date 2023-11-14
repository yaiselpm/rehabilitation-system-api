package com.killer.rehabilitationsystemapi.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.killer.rehabilitationsystemapi.domain.entities.TreatmentsPerfom;
import com.killer.rehabilitationsystemapi.persistence.repositories.TreatmentPerfomRepository;

@Service
public class TreatmentsPerfomService {
    
    @Autowired
    private TreatmentPerfomRepository treatmentPerfomRepository;

     @Transactional
    public List<TreatmentsPerfom> createPerfom(List<TreatmentsPerfom> treatmentsPerfom) {
        
        return treatmentPerfomRepository.saveAll(treatmentsPerfom);
    }

    public TreatmentsPerfom findPerfom(TreatmentsPerfom treatmentsPerfom) {
        TreatmentsPerfom auxPerfom = treatmentPerfomRepository.getReferenceById(treatmentsPerfom.getId());
        return auxPerfom;
    }

    @Transactional
    public TreatmentsPerfom updatePerfom(TreatmentsPerfom treatmentsPerfom){
        TreatmentsPerfom auxPerfom = treatmentPerfomRepository.getReferenceById(treatmentsPerfom.getId());
        if (auxPerfom == null) {
            return null;
        }else{
            auxPerfom = treatmentPerfomRepository.save(treatmentsPerfom);
        }
        return auxPerfom;
    }

    public void deletePerfom(TreatmentsPerfom treatmentsPerfom){
        treatmentPerfomRepository.delete(treatmentsPerfom);
    }
}
