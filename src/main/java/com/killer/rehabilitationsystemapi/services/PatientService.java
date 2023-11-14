package com.killer.rehabilitationsystemapi.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.killer.rehabilitationsystemapi.domain.coders.patient.ConsultPlan;
import com.killer.rehabilitationsystemapi.domain.entities.Patient;
import com.killer.rehabilitationsystemapi.persistence.repositories.PatientRepository;
import com.killer.rehabilitationsystemapi.services.coders.patient.ConsultPlanService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;
    
    @Autowired
    private ConsultPlanService consultPlanService = new ConsultPlanService();

    public List<Patient> getPatientByName(String name) {

        List<Patient> patients = patientRepository.findByName(name);
        return patients;
        // return patient;
    }

    public List<Patient> findByNameAndIdNumberAndClinicHistory(String name, Long idNumber, Long clinicHistory) {
        return patientRepository.findDistinctByNameOrIdNumberOrClinicHistoryIsAllIgnoreCase(name, idNumber, clinicHistory);
    }

    public List<Patient> getPatients(){
        return patientRepository.findAll();
    }

    @Transactional
    public Patient createPatient(Patient patient) {

        return patientRepository.save(patient);
        
    }

    @Transactional
    public Patient updatePatient(Patient patient) {

        return (patientRepository.existsById(patient.getPatientId())) ?patientRepository.save(patient): patient;       
        
    }
    // @Transactional
    // public Mono<Patient> updatePatient(Patient patient) {

    //     return patientRepository.save(patient);       
        
    // }

    public Patient getPatientById(Long id){
        return patientRepository.getReferenceById(id);
    }
    @Transactional
    public Patient createConsultPlan(Patient patient, ConsultPlan consultPlan){
        ConsultPlan aux = consultPlanService.createConsultPlan(consultPlan);
        patient.setConsultPlan(aux);
        return patientRepository.save(patient);
        
    }
    public Page<Patient> findAll(Pageable pageable){
        return patientRepository.findAll( PageRequest.of(
                    pageable.getPageNumber(),
                    pageable.getPageSize()));
    }
}
