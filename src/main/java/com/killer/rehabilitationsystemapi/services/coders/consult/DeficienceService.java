package com.killer.rehabilitationsystemapi.services.coders.consult;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.killer.rehabilitationsystemapi.domain.coders.consult.Deficience;
import com.killer.rehabilitationsystemapi.persistence.repositories.coders.consult.DeficienceRepository;

@Service
public class DeficienceService {

    @Autowired
    private DeficienceRepository deficienceRepository;

    @Transactional
    public Deficience createDeficience(Deficience deficience) {

        return deficienceRepository.save(deficience);
        
    }

    @Transactional
    public Deficience updateDeficience(Deficience deficience) {

        return (deficienceRepository.existsById(deficience.getId()))?deficienceRepository.save(deficience): deficience;       
        
    }

    public List<Deficience> getAllDeficience() {
        return deficienceRepository.findAll();
    }

    public Deficience getDeficience(Deficience deficience) {
        return deficienceRepository.getReferenceById(deficience.getId());
    }
}
