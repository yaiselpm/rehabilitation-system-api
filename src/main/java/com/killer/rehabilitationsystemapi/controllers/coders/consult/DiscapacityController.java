package com.killer.rehabilitationsystemapi.controllers.coders.consult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.killer.rehabilitationsystemapi.domain.coders.consult.Discapacity;
import com.killer.rehabilitationsystemapi.services.coders.consult.DiscapacityService;

@RestController
@RequestMapping("discapacities")
public class DiscapacityController {
    
    @Autowired
    private DiscapacityService discapacityService;

     @GetMapping("/search")
    public ResponseEntity<?> findDiscapacity(@RequestBody Discapacity discapacity) {
        Discapacity pa=   discapacityService.getDiscapacity(discapacity);      
        // if(pa==null)  {
        //     return ResponseEntity.ok("Patient not found");
        // }
        // return ResponseEntity.ok(pa);
        
        return (pa==null)? ResponseEntity.notFound().build(): ResponseEntity.ok(pa);       
    }
    @PostMapping("/discapacity")
    public ResponseEntity<?> createDiscapacity(@RequestBody Discapacity discapacity){
           discapacityService.createDiscapacity(discapacity);
        return ResponseEntity.ok("Discapacity created successfully");
    }

    @PutMapping("/discapacity")
    public ResponseEntity<?> updateDiscapacity(@RequestBody Discapacity discapacity){        
        discapacityService.updateDiscapacity(discapacity);
        return ResponseEntity.ok("Discapacity updated successfully");
    }
}
