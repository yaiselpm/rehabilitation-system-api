package com.killer.rehabilitationsystemapi.services.coders.medical;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.killer.rehabilitationsystemapi.domain.coders.medical.Speciality;
import com.killer.rehabilitationsystemapi.persistence.repositories.coders.medical.SpecialityRepository;

@Service
public class SpecialityService {

    @Autowired
    private SpecialityRepository specialityRepository;
    
    @Transactional
    public Speciality createSpeciality(Speciality speciality) {

        return specialityRepository.save(speciality);
        
    }

    @Transactional
    public Speciality updateSpeciality(Speciality speciality) {

        return (specialityRepository.existsById(speciality.getId()))?specialityRepository.save(speciality): speciality;       
        
    }

    public List<Speciality> getAllSpeciality() {
        return specialityRepository.findAll();
    }

    public Speciality getSpeciality(Speciality speciality) {
        return specialityRepository.getReferenceById(speciality.getId());
    }
}
