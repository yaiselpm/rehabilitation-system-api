package com.killer.rehabilitationsystemapi.controllers.coders.consult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.killer.rehabilitationsystemapi.domain.coders.consult.DiagnosticType;
import com.killer.rehabilitationsystemapi.services.coders.consult.DiagnosticTypeService;
@RestController
@RequestMapping("/diagnosticTypes")
public class DiagnosticTypeController {

    @Autowired
    private DiagnosticTypeService diagnosticTypeService;
 
     @GetMapping("/search")
    public ResponseEntity<?> findDiagnosticType(@RequestBody DiagnosticType diagnostic) {
        DiagnosticType pa=   diagnosticTypeService.getDiagnosticType(diagnostic);      
        // if(pa==null)  {
        //     return ResponseEntity.ok("Patient not found");
        // }
        // return ResponseEntity.ok(pa);
        
        return (pa==null)? ResponseEntity.notFound().build(): ResponseEntity.ok(pa);       
    }
    @PostMapping("/diagnosticType")
    public ResponseEntity<?> createDiagnosticType(@RequestBody DiagnosticType diagnosticTypes){
           diagnosticTypeService.createDiagnosticType(diagnosticTypes);
        return ResponseEntity.ok("Deficience created successfully");
    }

    @PutMapping("/diagnosticType")
    public ResponseEntity<?> updateDiagnosticType(@RequestBody DiagnosticType diagnosticType){        
        diagnosticTypeService.updateDiagnosticType(diagnosticType);
        return ResponseEntity.ok("Deficience updated successfully");
    }
}
