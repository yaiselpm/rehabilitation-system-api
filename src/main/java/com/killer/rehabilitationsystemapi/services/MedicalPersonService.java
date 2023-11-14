package com.killer.rehabilitationsystemapi.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.killer.rehabilitationsystemapi.domain.entities.MedicalPerson;
import com.killer.rehabilitationsystemapi.persistence.repositories.MedicalPersonRepository;

@Service
public class MedicalPersonService {
    
    @Autowired
    private MedicalPersonRepository medicalPersonRepository;

    /**
     * Constructor.
     */
    public MedicalPersonService() {
    }

    @Transactional
    public MedicalPerson createMedicalPerson(MedicalPerson medicalPerson) {
        return medicalPersonRepository.save(medicalPerson);
    }
    
    @Transactional
    public MedicalPerson updateMedicalPerson(MedicalPerson medicalPerson) {
        return (medicalPersonRepository.existsById(medicalPerson.getId()))? medicalPersonRepository.save(medicalPerson): null;
    }

    public List<MedicalPerson> getAllMedical() {
        return medicalPersonRepository.findAll();
    }

    public MedicalPerson getMedical(MedicalPerson medicalPerson) {
        return medicalPersonRepository.findByIdNumber(medicalPerson.getIdNumber());
    }

     public MedicalPerson getMedicalById(Long doctorId) {
        return medicalPersonRepository.getReferenceById(doctorId);
    }
}
