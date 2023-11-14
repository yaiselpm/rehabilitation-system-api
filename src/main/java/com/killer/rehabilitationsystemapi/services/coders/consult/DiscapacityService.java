package com.killer.rehabilitationsystemapi.services.coders.consult;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.killer.rehabilitationsystemapi.domain.coders.consult.Discapacity;
import com.killer.rehabilitationsystemapi.persistence.repositories.coders.consult.DiscapacityRepository;

@Service
public class DiscapacityService {

    @Autowired
    private DiscapacityRepository discapacityRepository;
    
    @Transactional
    public Discapacity createDiscapacity(Discapacity discapacity) {

        return discapacityRepository.save(discapacity);
        
    }

    @Transactional
    public Discapacity updateDiscapacity(Discapacity discapacity) {

        return (discapacityRepository.existsById(discapacity.getId()))?discapacityRepository.save(discapacity): discapacity;       
        
    }

    public List<Discapacity> getAllDiscapacity() {
        return discapacityRepository.findAll();
    }

    public Discapacity getDiscapacity(Discapacity discapacity) {
        return discapacityRepository.getReferenceById(discapacity.getId());
    }
}
