package com.killer.rehabilitationsystemapi.controllers.coders.medical;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.killer.rehabilitationsystemapi.domain.coders.medical.Speciality;
import com.killer.rehabilitationsystemapi.services.coders.medical.SpecialityService;

@RestController
@RequestMapping("/specialities")
public class SpecialityController {
    
    @Autowired
    private SpecialityService specialityService;

     @GetMapping("/search")
    public ResponseEntity<?> findSpeciality(@RequestBody Speciality speciality) {
        Speciality pa=   specialityService.getSpeciality(speciality);      
        // if(pa==null)  {
        //     return ResponseEntity.ok("Patient not found");
        // }
        // return ResponseEntity.ok(pa);
        
        return (pa==null)? ResponseEntity.notFound().build(): ResponseEntity.ok(pa);       
    }
    @PostMapping("/speciality")
    public ResponseEntity<?> createSpeciality(@RequestBody Speciality speciality){
           specialityService.createSpeciality(speciality);
        return ResponseEntity.ok("Speciality created successfully");
    }

    @PutMapping("/speciality")
    public ResponseEntity<?> updateSpeciality(@RequestBody Speciality speciality){        
        specialityService.updateSpeciality(speciality);
        return ResponseEntity.ok("Speciality updated successfully");
    }
}
