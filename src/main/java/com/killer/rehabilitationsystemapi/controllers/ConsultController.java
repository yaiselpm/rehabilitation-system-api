package com.killer.rehabilitationsystemapi.controllers;

import java.net.URI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.killer.rehabilitationsystemapi.domain.coders.patient.ConsultPlan;
import com.killer.rehabilitationsystemapi.domain.entities.Consult;
import com.killer.rehabilitationsystemapi.domain.entities.Patient;
import com.killer.rehabilitationsystemapi.services.ConsultService;
import com.killer.rehabilitationsystemapi.services.PatientService;

@RestController
@RequestMapping("/consults")
public class ConsultController {
    
    @Autowired
    private ConsultService consultService;
    @Autowired
    private PatientService patientService;

    @PostMapping("/consult")
    public ResponseEntity<?> createConsult(@Validated @RequestBody Consult consult, UriComponentsBuilder ucb) throws ParseException {
        Patient patient = patientService.getPatientById(consult.getPatient().getPatientId());
        Consult consultAux;
        if (consult.getDeficience() == null || consult.getDiagnosticType() == null|| consult.getDiscapacity()==null|| consult.getTreatmentPlace()==null || consult.getTreatmentsPerfom()==null) {
            return ResponseEntity.ok("Some properties must be not null");
            
        }
        Date date= new Date();
        String dateFormat= new SimpleDateFormat("yyyy-MM-dd").format(date);        
        // Date da= new SimpleDateFormat("yyyy-MM-dd").parse(dateFormat);
        ConsultPlan consultPlan= patient.getConsultPlan();
        String dateCon= new SimpleDateFormat("yyyy-MM-dd").format(consultPlan.getDay());
        System.out.println(consultPlan.getDay()+ "  "+ dateFormat+" "+ dateCon);
        if (!dateCon.equals(dateFormat)) {
            return ResponseEntity.ok("The patient does not have any consult plans for this day.");
            
        }else{
        // if (dateCon.equals(dateFormat)) {            
        System.out.println("Entro aqui");
        consult.setPatient(patient);
        consultAux = consultService.createConsult(consult);
        }
       URI locationOfNewPatient =ucb
                    .path("consults/consult/{id}")
                    .buildAndExpand(consultAux.getId())
                    .toUri();
        
        return ResponseEntity.created(locationOfNewPatient).body("Consult added successfully");
        
    }

    @GetMapping("/consult/{id}")
    public Consult getConsultByConsultId(@PathVariable Long id){
        return consultService.findConsult(id);
    }

    
}
