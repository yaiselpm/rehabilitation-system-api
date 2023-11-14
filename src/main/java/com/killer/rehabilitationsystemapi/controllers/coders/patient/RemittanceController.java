package com.killer.rehabilitationsystemapi.controllers.coders.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.killer.rehabilitationsystemapi.domain.coders.patient.Remittance;
import com.killer.rehabilitationsystemapi.services.coders.patient.RemittanceService;

@RestController
@RequestMapping("/remittances")
public class RemittanceController {
    
    @Autowired
    private RemittanceService remittanceService;

     @GetMapping("/search")
    public ResponseEntity<?> findRemittance(@RequestBody Remittance remittance) {
        Remittance pa=   remittanceService.getRemittance(remittance);      
        // if(pa==null)  {
        //     return ResponseEntity.ok("Patient not found");
        // }
        // return ResponseEntity.ok(pa);
        
        return (pa==null)? ResponseEntity.notFound().build(): ResponseEntity.ok(pa);       
    }
    @PostMapping("/remittance")
    public ResponseEntity<?> createDeficience(@RequestBody Remittance remittance){
           remittanceService.createRemittance(remittance);
        return ResponseEntity.ok("Remittance created successfully");
    }

    @PutMapping("/remittance")
    public ResponseEntity<?> updateRemittance(@RequestBody Remittance remittance){        
        remittanceService.updateRemittance(remittance);
        return ResponseEntity.ok("Remittance updated successfully");
    }
}
