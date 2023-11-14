package com.killer.rehabilitationsystemapi.controllers.coders.treatment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.killer.rehabilitationsystemapi.domain.coders.treatment.Treatment;
import com.killer.rehabilitationsystemapi.services.coders.treatment.TreatmentService;

@RestController
@RequestMapping("/treatments")
public class TreatmentController {
    
    @Autowired
    private TreatmentService treatmentService;

     @GetMapping("/search")
    public ResponseEntity<?> findTreatment(@RequestBody Treatment treatment) {
        Treatment pa=   treatmentService.getTreatment(treatment);      
        // if(pa==null)  {
        //     return ResponseEntity.ok("Patient not found");
        // }
        // return ResponseEntity.ok(pa);
        
        return (pa==null)? ResponseEntity.notFound().build(): ResponseEntity.ok(pa);       
    }
    @PostMapping("/treatment")
    public ResponseEntity<?> createTreatment(@RequestBody Treatment treatment){
           treatmentService.createTreatment(treatment);
        return ResponseEntity.ok("Treatment created successfully");
    }

    @PutMapping("/treatment")
    public ResponseEntity<?> updateTreatment(@RequestBody Treatment treatment){        
        treatmentService.updateTreatment(treatment);
        return ResponseEntity.ok("Treatment updated successfully");
    }
}
