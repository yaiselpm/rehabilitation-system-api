package com.killer.rehabilitationsystemapi.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.killer.rehabilitationsystemapi.domain.entities.MedicalPerson;
import com.killer.rehabilitationsystemapi.services.MedicalPersonService;

@RestController
@RequestMapping("/medicals")
public class MedicalPersonController {
    
    @Autowired
    private MedicalPersonService medicalPersonService;

    @PostMapping("/register")
    public ResponseEntity<?> registerMedicalPerson(@RequestBody MedicalPerson medicalPerson, UriComponentsBuilder ucb) {
        MedicalPerson mPerson = medicalPersonService.createMedicalPerson(medicalPerson);
        URI locationOfNewPatient =ucb
                    .path("medicals/medic/{id}")
                    .buildAndExpand(mPerson.getId())
                    .toUri();
        return ResponseEntity.created(locationOfNewPatient).build();
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateMedicalPerson(@RequestBody MedicalPerson medicalPerson) {
        MedicalPerson mPerson = medicalPersonService.updateMedicalPerson(medicalPerson);
        return ResponseEntity.ok(mPerson);
    }

    @GetMapping("/medical")
    public List<MedicalPerson> listAllMedicalPersons() {
        return medicalPersonService.getAllMedical();
    }

    @GetMapping("/medic/{id}")
    public MedicalPerson listAMedicalPerson(@PathVariable Long id) {
        return getMedicPerson(id);
    }

    private MedicalPerson getMedicPerson(Long id) {
        return medicalPersonService.getMedicalById(id);
    }
}
