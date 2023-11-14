package com.killer.rehabilitationsystemapi.controllers.coders.treatment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.killer.rehabilitationsystemapi.domain.coders.treatment.Asistence;
import com.killer.rehabilitationsystemapi.services.coders.treatment.AsistenceService;

@RestController
@RequestMapping("/asistences")
public class AsistenceController {
    
    @Autowired
    private AsistenceService asistencesService;

     @GetMapping("/search")
    public ResponseEntity<?> findAsistence(@RequestBody Asistence asistence) {
        Asistence pa=   asistencesService.getAsistence(asistence);      
        // if(pa==null)  {
        //     return ResponseEntity.ok("Patient not found");
        // }
        // return ResponseEntity.ok(pa);
        
        return (pa==null)? ResponseEntity.notFound().build(): ResponseEntity.ok(pa);       
    }
    @PostMapping("/asistence")
    public ResponseEntity<?> createAsistence(@RequestBody Asistence asistence){
           asistencesService.createAsistence(asistence);
        return ResponseEntity.ok("Asistence created successfully");
    }

    @PutMapping("/asistence")
    public ResponseEntity<?> updateAsistence(@RequestBody Asistence asistence){        
        asistencesService.updateAsistence(asistence);
        return ResponseEntity.ok("Asistence updated successfully");
    }
}
