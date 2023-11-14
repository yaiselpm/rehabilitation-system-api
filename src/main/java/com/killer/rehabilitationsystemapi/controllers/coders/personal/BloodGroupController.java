package com.killer.rehabilitationsystemapi.controllers.coders.personal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.killer.rehabilitationsystemapi.domain.coders.personal.BloodGroup;
import com.killer.rehabilitationsystemapi.services.coders.personal.BloodGroupService;

@RestController
@RequestMapping("/bloodgroups")
public class BloodGroupController {

    @Autowired
    private BloodGroupService bloodGroupService;

     @GetMapping("/search")
    public ResponseEntity<?> findBloodGroup(@RequestBody BloodGroup bloodGroup) {
        BloodGroup pa=   bloodGroupService.getBloodGroup(bloodGroup);      
        // if(pa==null)  {
        //     return ResponseEntity.ok("Patient not found");
        // }
        // return ResponseEntity.ok(pa);
        
        return (pa==null)? ResponseEntity.notFound().build(): ResponseEntity.ok(pa);       
    }
    @PostMapping("/bloodGroup")
    public ResponseEntity<?> createBloodGroup(@RequestBody BloodGroup bloodGroup){
           bloodGroupService.createBloodGroup(bloodGroup);
        return ResponseEntity.ok("BloodGroup created successfully");
    }

    @PutMapping("/bloodGroup")
    public ResponseEntity<?> updateBloodGroup(@RequestBody BloodGroup bloodGroup){        
        bloodGroupService.updateBloodGroup(bloodGroup);
        return ResponseEntity.ok("BloodGroup updated successfully");
    }
}
