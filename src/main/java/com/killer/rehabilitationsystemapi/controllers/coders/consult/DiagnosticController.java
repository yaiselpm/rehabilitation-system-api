package com.killer.rehabilitationsystemapi.controllers.coders.consult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.killer.rehabilitationsystemapi.domain.coders.consult.Diagnostic;
import com.killer.rehabilitationsystemapi.services.coders.consult.DiagnosticService;

public class DiagnosticController {

    @Autowired
    DiagnosticService diagnosticService;
    
    //  @GetMapping("/search")
    // public ResponseEntity<?> findDiagnostic(@RequestBody Diagnostic diagnostic) {
    //     // Diagnostic pa=   diagnosticService.getAll();      
    //     // if(pa==null)  {
    //     //     return ResponseEntity.ok("Patient not found");
    //     // }
    //     // return ResponseEntity.ok(pa);
        
    //     return (pa==null)? ResponseEntity.notFound().build(): ResponseEntity.ok(pa);       
    // }
    // @PostMapping("/diagnostic")
    // public ResponseEntity<?> createDiagnostic(@RequestBody Diagnostic diagnostic){
    //        diagnosticService.createDeficience(diagnostic);
    //     return ResponseEntity.ok("Diagnostic created successfully");
    // }

    // @PutMapping("/diagnostic")
    // public ResponseEntity<?> updateDiagnostic(@RequestBody Diagnostic diagnostic){        
    //     diagnosticService.updateDeficience(diagnostic);
    //     return ResponseEntity.ok("Diagnostic updated successfully");
    // }
}
