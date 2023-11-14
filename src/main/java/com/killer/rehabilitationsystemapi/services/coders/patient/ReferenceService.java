package com.killer.rehabilitationsystemapi.services.coders.patient;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.killer.rehabilitationsystemapi.domain.coders.patient.Reference;
import com.killer.rehabilitationsystemapi.persistence.repositories.coders.patient.ReferenceRepository;

@Service
public class ReferenceService {

    @Autowired
    private ReferenceRepository referenceRepository;
    
    @Transactional
    public Reference createReference(Reference reference) {

        return referenceRepository.save(reference);
        
    }

    @Transactional
    public Reference updateReference(Reference reference) {

        return (referenceRepository.existsById(reference.getId()))?referenceRepository.save(reference): reference;       
        
    }

    public List<Reference> getAllReference() {
        return referenceRepository.findAll();
    }

    public Reference getReference(Reference reference) {
        return referenceRepository.getReferenceById(reference.getId());
    }
}
