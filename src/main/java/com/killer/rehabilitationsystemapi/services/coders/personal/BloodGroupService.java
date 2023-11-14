package com.killer.rehabilitationsystemapi.services.coders.personal;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.killer.rehabilitationsystemapi.domain.coders.personal.BloodGroup;
import com.killer.rehabilitationsystemapi.persistence.repositories.coders.personal.BloodGroupRepository;

@Service
public class BloodGroupService {

    @Autowired
    private BloodGroupRepository bloodGroupRepository;
    
    @Transactional
    public BloodGroup createBloodGroup(BloodGroup bloodGroup) {

        return bloodGroupRepository.save(bloodGroup);
        
    }

    @Transactional
    public BloodGroup updateBloodGroup(BloodGroup bloodGroup) {

        return (bloodGroupRepository.existsById(bloodGroup.getId()))?bloodGroupRepository.save(bloodGroup): bloodGroup;       
        
    }

    public List<BloodGroup> getAllBloodGroup() {
        return bloodGroupRepository.findAll();
    }

    public BloodGroup getBloodGroup(BloodGroup bloodGroup) {
        return bloodGroupRepository.getReferenceById(bloodGroup.getId());
    }
}
