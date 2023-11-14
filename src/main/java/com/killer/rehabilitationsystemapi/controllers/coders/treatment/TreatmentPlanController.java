package com.killer.rehabilitationsystemapi.controllers.coders.treatment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.killer.rehabilitationsystemapi.domain.coders.treatment.TreatmentPlan;
import com.killer.rehabilitationsystemapi.services.coders.treatment.TreatmentPlanService;

@RestController
@RequestMapping("/treatmentsPlan")
public class TreatmentPlanController {
    
    @Autowired
    private TreatmentPlanService treatmentPlanService;

     @GetMapping("/search")
    public ResponseEntity<?> findTreatmentPlan(@RequestBody TreatmentPlan treatmentPlan) {
        TreatmentPlan pa=   treatmentPlanService.getTreatmentPlan(treatmentPlan);      
        // if(pa==null)  {
        //     return ResponseEntity.ok("Patient not found");
        // }
        // return ResponseEntity.ok(pa);
        
        return (pa==null)? ResponseEntity.notFound().build(): ResponseEntity.ok(pa);       
    }
    @PostMapping("/treatmentPlan")
    public ResponseEntity<?> createTreatmentPlan(@RequestBody TreatmentPlan treatmentPlan){
           treatmentPlanService.createTreatmentPlan(treatmentPlan);
        return ResponseEntity.ok("TreatmentPlan created successfully");
    }

    @PutMapping("/treatmentPlan")
    public ResponseEntity<?> updateTreatmentPlan(@RequestBody TreatmentPlan treatmentPlan){        
        treatmentPlanService.updateTreatmentPlan(treatmentPlan);
        return ResponseEntity.ok("TreatmentPlan updated successfully");
    }
}
