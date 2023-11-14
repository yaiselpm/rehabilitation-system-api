package com.killer.rehabilitationsystemapi.controllers.coders.personal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.killer.rehabilitationsystemapi.domain.coders.personal.Status;
import com.killer.rehabilitationsystemapi.services.coders.personal.StatusService;

@RestController
@RequestMapping("/statuses")
public class StatusController {
    
    @Autowired
    private StatusService statusService;

     @GetMapping("/search")
    public ResponseEntity<?> findStatus(@RequestBody Status status) {
        Status pa=   statusService.getStatus(status);      
        // if(pa==null)  {
        //     return ResponseEntity.ok("Patient not found");
        // }
        // return ResponseEntity.ok(pa);
        
        return (pa==null)? ResponseEntity.notFound().build(): ResponseEntity.ok(pa);       
    }
    @PostMapping("/status")
    public ResponseEntity<?> createStatus(@RequestBody Status status){
           statusService.createStatus(status);
        return ResponseEntity.ok("Status created successfully");
    }

    @PutMapping("/status")
    public ResponseEntity<?> updateStatus(@RequestBody Status status){        
        statusService.updateStatus(status);
        return ResponseEntity.ok("Status updated successfully");
    }
}
