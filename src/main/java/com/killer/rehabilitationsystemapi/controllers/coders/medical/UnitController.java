package com.killer.rehabilitationsystemapi.controllers.coders.medical;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.killer.rehabilitationsystemapi.domain.coders.medical.Unit;
import com.killer.rehabilitationsystemapi.services.coders.medical.UnitService;

@RestController
@RequestMapping("/units")
public class UnitController {
    
    @Autowired
    private UnitService unitService;

     @GetMapping("/search")
    public ResponseEntity<?> findUnit(@RequestBody Unit unit) {
        Unit pa=   unitService.getUnit(unit);      
        // if(pa==null)  {
        //     return ResponseEntity.ok("Patient not found");
        // }
        // return ResponseEntity.ok(pa);
        
        return (pa==null)? ResponseEntity.notFound().build(): ResponseEntity.ok(pa);       
    }
    @PostMapping("/unit")
    public ResponseEntity<?> createUnit(@RequestBody Unit unit){
           unitService.createUnit(unit);
        return ResponseEntity.ok("Unit created successfully");
    }

    @PutMapping("/unit")
    public ResponseEntity<?> updateUnit(@RequestBody Unit unit){        
        unitService.updateUnit(unit);
        return ResponseEntity.ok("Unit updated successfully");
    }
}
