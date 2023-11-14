package com.killer.rehabilitationsystemapi.controllers.coders.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.killer.rehabilitationsystemapi.domain.coders.patient.Reference;
import com.killer.rehabilitationsystemapi.services.coders.patient.ReferenceService;

@RestController
@RequestMapping("/references")
public class ReferenceController {
    
    @Autowired
    private ReferenceService referenceService;

     @GetMapping("/search")
    public ResponseEntity<?> findReference(@RequestBody Reference reference) {
        Reference pa=   referenceService.getReference(reference);      
        // if(pa==null)  {
        //     return ResponseEntity.ok("Patient not found");
        // }
        // return ResponseEntity.ok(pa);
        
        return (pa==null)? ResponseEntity.notFound().build(): ResponseEntity.ok(pa);       
    }
    @PostMapping("/Reference")
    public ResponseEntity<?> createReference(@RequestBody Reference reference){
           referenceService.createReference(reference);
        return ResponseEntity.ok("Reference created successfully");
    }

    @PutMapping("/Reference")
    public ResponseEntity<?> updateReference(@RequestBody Reference reference){        
        referenceService.updateReference(reference);
        return ResponseEntity.ok("Reference updated successfully");
    }
}
