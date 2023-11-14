package com.killer.rehabilitationsystemapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.killer.rehabilitationsystemapi.domain.coders.consult.Diagnostic;
import com.killer.rehabilitationsystemapi.enums.CoderEnum;
import com.killer.rehabilitationsystemapi.services.CoderService;

@RestController
@RequestMapping("/coders")
public class CoderController {
    
    @Autowired
    private CoderService coderService;

    @GetMapping("/")
    public List<?> getAllCoder() {

        return coderService.getAll();
        
    }

    @PostMapping("/create")
    public ResponseEntity<?> createCoder(@RequestParam(required = false) Long id, @RequestParam("name") String name , @RequestParam("coder") CoderEnum coderEnum) {
        System.out.println(coderEnum +" "+ id +" "+ name);
        if (coderEnum.toString()==CoderEnum.Diagnostic.toString()) {
            Diagnostic diagnostic = new Diagnostic();
            // Diagnostic diagnostic2= new Diagnostic();
            // diagnostic.getClass().getDeclaredFields();//setDiagnostic(name);  
            diagnostic.setDiagnostic(name);
            System.out.println(diagnostic.getClass().cast(Diagnostic.class));       
            return coderService.create( diagnostic);
        }
        return null;
    }
}
