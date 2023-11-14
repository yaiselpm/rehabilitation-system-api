package com.killer.rehabilitationsystemapi.controllers.coders.patient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.killer.rehabilitationsystemapi.domain.coders.patient.ConsultPlan;
import com.killer.rehabilitationsystemapi.domain.entities.MedicalPerson;
import com.killer.rehabilitationsystemapi.services.MedicalPersonService;
import com.killer.rehabilitationsystemapi.services.coders.patient.ConsultPlanService;

@RestController
@RequestMapping("/consultPlans")
public class ConsultPlanController {
 
    @Autowired
    private ConsultPlanService consultPlanService;
    
    MedicalPersonService medicalPersonService = new MedicalPersonService();
    
     @GetMapping("/search")
    public ResponseEntity<?> findConsultPlan(@RequestBody ConsultPlan consultPlan) {
        ConsultPlan pa=   consultPlanService.getConsultPlan(consultPlan);      
        // if(pa==null)  {
        //     return ResponseEntity.ok("Patient not found");
        // }
        // return ResponseEntity.ok(pa);
        
        return (pa==null)? ResponseEntity.notFound().build(): ResponseEntity.ok(pa);       
    }

    @GetMapping("/find/{doctorId}/doctor")
    public ResponseEntity<?> findAllConsultByDoctor(@PathVariable("doctorId") Long doctorId){
        List<ConsultPlan> plans= consultPlanService.getAllByDoctor(doctorId);
        return (plans.isEmpty())? ResponseEntity.ok("The doctor don't have any consult "): ResponseEntity.ok(plans);
    }

    @PostMapping("/consultPlan")
    public ResponseEntity<?> createConsultPlan(@RequestBody ConsultPlan consultPlan){
        MedicalPerson doctor;        
        doctor = medicalPersonService.getMedical(consultPlan.getDoctor());
        if(doctor == null){
            // return (ResponseEntity)ResponseEntity.status(HttpStatus.NOT_FOUND);
            return ResponseEntity.ok("Doctor not Found");
        }
        consultPlanService.createConsultPlan(consultPlan);
        return ResponseEntity.ok("Consult Plan created successfully "+ consultPlan);
    }

    @PutMapping("/consultPlan")
    public ResponseEntity<?> updateConsultPlan(@RequestBody ConsultPlan consultPlan){        
        consultPlanService.updateConsultPlan(consultPlan);
        return ResponseEntity.ok("Consult Plan updated successfully");
    }

}
