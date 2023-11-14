package com.killer.rehabilitationsystemapi.controllers.coders.consult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.killer.rehabilitationsystemapi.domain.coders.consult.Deficience;
import com.killer.rehabilitationsystemapi.services.coders.consult.DeficienceService;

@RestController
@RequestMapping("/deficients")
public class DeficienceController {
    
        
    @Autowired
    private DeficienceService deficienceService;

    // @GetMapping("/patient/{name}")
    // public ResponseEntity<?> getPatientByName(@PathVariable String name) {
    //    List< Patient> pa=   patientService.getPatientByName(name);      
    //     // if(pa==null)  {
    //     //     return ResponseEntity.ok("Patient not found");
    //     // }
    //     // return ResponseEntity.ok(pa);
    //     return (pa==null)? ResponseEntity.notFound().build():ResponseEntity.ok(pa);
    //     // return name;
    // }
    @GetMapping("/search")
    public ResponseEntity<?> findDeficience(@RequestBody Deficience deficience) {
        Deficience pa=   deficienceService.getDeficience(deficience);      
        // if(pa==null)  {
        //     return ResponseEntity.ok("Patient not found");
        // }
        // return ResponseEntity.ok(pa);
        
        return (pa==null)? ResponseEntity.notFound().build(): ResponseEntity.ok(pa);       
    }
    @PostMapping("/deficience")
    public ResponseEntity<?> createDeficience(@RequestBody Deficience deficience){
           deficienceService.createDeficience(deficience);
        return ResponseEntity.ok("Deficience created successfully");
    }

    @PutMapping("/deficience")
    public ResponseEntity<?> updateDeficience(@RequestBody Deficience deficience){        
        deficienceService.updateDeficience(deficience);
        return ResponseEntity.ok("Deficience updated successfully");
    }
}
