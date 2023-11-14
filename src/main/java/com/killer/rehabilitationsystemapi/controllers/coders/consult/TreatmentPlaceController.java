package com.killer.rehabilitationsystemapi.controllers.coders.consult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.killer.rehabilitationsystemapi.domain.coders.consult.TreatmentPlace;
import com.killer.rehabilitationsystemapi.services.coders.consult.TreatmentPlaceService;

@RestController
@RequestMapping("/treatmentsPlace")
public class TreatmentPlaceController {
    
    @Autowired
    private TreatmentPlaceService treatmentPlaceService;

     @GetMapping("/search")
    public ResponseEntity<?> findTreatmentPlace(@RequestBody TreatmentPlace treatmentPlace) {
        TreatmentPlace pa=   treatmentPlaceService.getTreatmentPlace(treatmentPlace);      
        // if(pa==null)  {
        //     return ResponseEntity.ok("Patient not found");
        // }
        // return ResponseEntity.ok(pa);
        
        return (pa==null)? ResponseEntity.notFound().build(): ResponseEntity.ok(pa);       
    }
    @PostMapping("/treatment")
    public ResponseEntity<?> createTreatmentPlace(@RequestBody TreatmentPlace treatmentPlace){
           treatmentPlaceService.createTreatmentPlace(treatmentPlace);
        return ResponseEntity.ok("Treatment created successfully");
    }

    @PutMapping("/treatment")
    public ResponseEntity<?> updateTreatmentPlace(@RequestBody TreatmentPlace treatmentPlace){        
        treatmentPlaceService.updateTreatmentPlace(treatmentPlace);
        return ResponseEntity.ok("Treatment updated successfully");
    }
}
