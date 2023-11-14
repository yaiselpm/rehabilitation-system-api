package com.killer.rehabilitationsystemapi.controllers.coders.treatment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.killer.rehabilitationsystemapi.domain.coders.treatment.Evolution;
import com.killer.rehabilitationsystemapi.services.coders.treatment.EvolutionService;

@RestController
@RequestMapping("/evolutions")
public class EvolutionController {
    
    @Autowired
    private EvolutionService evolutionService;

     @GetMapping("/search")
    public ResponseEntity<?> findEvolution(@RequestBody Evolution evolution) {
        Evolution pa=   evolutionService.getEvolution(evolution);      
        // if(pa==null)  {
        //     return ResponseEntity.ok("Patient not found");
        // }
        // return ResponseEntity.ok(pa);
        
        return (pa==null)? ResponseEntity.notFound().build(): ResponseEntity.ok(pa);       
    }
    @PostMapping("/evolution")
    public ResponseEntity<?> createEvolution(@RequestBody Evolution evolution){
           evolutionService.createEvolution(evolution);
        return ResponseEntity.ok("Evolution created successfully");
    }

    @PutMapping("/evolution")
    public ResponseEntity<?> updateEvolution(@RequestBody Evolution evolution){        
        evolutionService.updateEvolution(evolution);
        return ResponseEntity.ok("Evolution updated successfully");
    }
}
