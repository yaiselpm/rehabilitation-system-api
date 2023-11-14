package com.killer.rehabilitationsystemapi.controllers.coders.personal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.killer.rehabilitationsystemapi.domain.coders.personal.Municipality;
import com.killer.rehabilitationsystemapi.services.coders.personal.MunicipalityService;

@RestController
@RequestMapping("/municipalities")
public class MunicipalityController {
    
    @Autowired
    private MunicipalityService municipalityService;

     @GetMapping("/search")
    public ResponseEntity<?> findMunicipality(@RequestBody Municipality municipality) {
        Municipality pa=   municipalityService.getMunicipality(municipality);      
        // if(pa==null)  {
        //     return ResponseEntity.ok("Patient not found");
        // }
        // return ResponseEntity.ok(pa);
        
        return (pa==null)? ResponseEntity.notFound().build(): ResponseEntity.ok(pa);       
    }
    @PostMapping("/municipality")
    public ResponseEntity<?> createMunicipality(@RequestBody Municipality municipality){
           municipalityService.createMunicipality(municipality);
        return ResponseEntity.ok("Municipality created successfully");
    }

    @PutMapping("/municipality")
    public ResponseEntity<?> updateMunicipality(@RequestBody Municipality municipality){        
        municipalityService.updateMunicipality(municipality);
        return ResponseEntity.ok("Municipality updated successfully");
    }
}
