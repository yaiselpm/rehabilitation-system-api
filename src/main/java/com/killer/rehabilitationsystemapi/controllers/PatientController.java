package com.killer.rehabilitationsystemapi.controllers;

import java.net.URI;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.killer.rehabilitationsystemapi.domain.entities.MedicalPerson;
import com.killer.rehabilitationsystemapi.domain.entities.Patient;
import com.killer.rehabilitationsystemapi.services.PatientService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import com.killer.rehabilitationsystemapi.domain.coders.patient.ConsultPlan;

@RestController
@RequestMapping("/patients")
public class PatientController {
    
    @Autowired
    private PatientService patientService;

    @GetMapping("/patients/{name}")
    public ResponseEntity<?> getPatientByName(@PathVariable String name) {
       List< Patient> pa=   patientService.getPatientByName(name); 
        return (pa==null)? ResponseEntity.notFound().build():ResponseEntity.ok(pa);        
    }
     @GetMapping("/patient/{id}")
    public ResponseEntity<?> getPatientId(@PathVariable Long id) {
       Patient patient= getPatientById(id);              
        return (patient==null)? ResponseEntity.notFound().build():ResponseEntity.ok(patient);        
    }

    @GetMapping("/search")
    public ResponseEntity<?> findPatient(@RequestParam(value = "idNumber", required = false) Long idNumber, @RequestParam(value = "name", required = false) String name, @RequestParam(value = "clinicHistory", required= false) Long clinicHistory) {
        List< Patient> pa=   patientService.findByNameAndIdNumberAndClinicHistory(name, idNumber, clinicHistory);      
        
        List<Patient> uniquePatients = new ArrayList<>();
        if(clinicHistory != null){            
            for (Patient patient : pa) {                
                if (patient.getClinicHistory()== clinicHistory) {
                    uniquePatients.add(patient);  
                }
            }
        }
        return (pa==null|| uniquePatients.isEmpty())? ResponseEntity.notFound().build():(clinicHistory==null)?ResponseEntity.ok(pa):ResponseEntity.ok(uniquePatients);        
    }
    @PostMapping("/patient")
    public ResponseEntity<Void> createPatient(@RequestBody Patient patient, UriComponentsBuilder ucb){
          Patient patient2= patientService.createPatient(patient);                                    
           URI locationOfNewPatient =ucb
                    .path("patients/patient/{id}")
                    .buildAndExpand(patient2.getPatientId())
                    .toUri();

        return  ResponseEntity.created(locationOfNewPatient).build();
    }

    @PutMapping("/patient")
    public ResponseEntity<?> updatePatient(@RequestBody Patient patient){        
        patientService.updatePatient(patient);
        return ResponseEntity.ok("Patient updated successfully");
    }
    
     @GetMapping("/patient")
    public List<Patient> listAllPatients() {
        return patientService.getPatients();
    }

    @GetMapping("/patients")
    public ResponseEntity<List<Patient>> findAll(Pageable pageable) {
        Page<Patient> page = patientService.findAll(
                PageRequest.of(pageable.getPageNumber(),
                pageable.getPageSize(),
                pageable.getSortOr(Sort.by(Sort.Direction.ASC, "name"))
        ));
        return ResponseEntity.ok(page.getContent());
    }

    @PostMapping("/register/{id}/consultPlan")
    public ResponseEntity<?> createConsultPlan(@PathVariable("id") Long id,@RequestBody ConsultPlan consultPlan, UriComponentsBuilder ucb) throws ParseException{
        Patient patient = getPatientById(id);
        MedicalPerson doctor= consultPlan.getDoctor();
        if(patient.getPatientId()==null){
            return (ResponseEntity<?>)ResponseEntity.notFound();
        }else if(doctor.getId()==null){
            return (ResponseEntity<?>)ResponseEntity.notFound();
        }
        Date date = new Date();
        // SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");
        // date= dateFormat.parse("2023-12-31");
        // System.out.println(date + " " + dateFormat.toString());
        if (consultPlan.getDay().before(date)) {
            return (ResponseEntity<?>) ResponseEntity.badRequest();
        }
        Patient patient2= patientService.createConsultPlan(patient, consultPlan);
        HttpStatus status= HttpStatus.NOT_FOUND;
        URI locationOfNewPatient =ucb
                    .path("patients/patient/{id}")
                    .buildAndExpand(patient2.getPatientId())
                    .toUri();
        return (patient2==null) ? (ResponseEntity<?>)ResponseEntity.status(status): ResponseEntity.created(locationOfNewPatient).build();
        
    }

    private Patient getPatientById(Long id){
        return patientService.getPatientById(id);
    }
}
