package com.killer.rehabilitationsystemapi.services.coders.consult;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.killer.rehabilitationsystemapi.domain.coders.consult.TreatmentPlace;
import com.killer.rehabilitationsystemapi.persistence.repositories.coders.consult.TreatmentPlaceRepository;

@Service
public class TreatmentPlaceService {

    @Autowired
    private TreatmentPlaceRepository placeRepository;
    
    @Transactional
    public TreatmentPlace createTreatmentPlace(TreatmentPlace treatmentPlace) {

        return placeRepository.save(treatmentPlace);
        
    }

    @Transactional
    public TreatmentPlace updateTreatmentPlace(TreatmentPlace treatmentPlace) {

        return (placeRepository.existsById(treatmentPlace.getId()))?placeRepository.save(treatmentPlace): treatmentPlace;       
        
    }

    public List<TreatmentPlace> getAllTreatmentPlace() {
        return placeRepository.findAll();
    }

    public TreatmentPlace getTreatmentPlace(TreatmentPlace treatmentPlace) {
        return placeRepository.getReferenceById(treatmentPlace.getId());
    }
}
