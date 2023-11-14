package com.killer.rehabilitationsystemapi.services.coders.treatment;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.killer.rehabilitationsystemapi.domain.coders.treatment.Asistence;
import com.killer.rehabilitationsystemapi.persistence.repositories.coders.treatment.AsistenceRepository;

@Service
public class AsistenceService {

    @Autowired
    private AsistenceRepository asistenceRepository;

    @Transactional
    public Asistence createAsistence(Asistence asistence) {

        return asistenceRepository.save(asistence);
        
    }

    @Transactional
    public Asistence updateAsistence(Asistence asistence) {

        return (asistenceRepository.existsById(asistence.getId()))?asistenceRepository.save(asistence): asistence;       
        
    }

    public List<Asistence> getAllAsistence() {
        return asistenceRepository.findAll();
    }

    public Asistence getAsistence(Asistence asistence) {
        return asistenceRepository.getReferenceById(asistence.getId());
    }
}
