package com.killer.rehabilitationsystemapi.controllers.coders.medical;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.killer.rehabilitationsystemapi.domain.coders.medical.Role;
import com.killer.rehabilitationsystemapi.services.coders.medical.RoleService;

@RestController
@RequestMapping("/roles")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @GetMapping("/search")
    public ResponseEntity<?> findRole(@RequestBody Role Role) {
        Role pa=   roleService.getRole(Role);      
        // if(pa==null)  {
        //     return ResponseEntity.ok("Patient not found");
        // }
        // return ResponseEntity.ok(pa);
        
        return (pa==null)? ResponseEntity.notFound().build(): ResponseEntity.ok(pa);       
    }
    @PostMapping("/Role")
    public ResponseEntity<?> createRole(@RequestBody Role role){
           roleService.createRole(role);
        return ResponseEntity.ok("Role created successfully");
    }

    @PutMapping("/Role")
    public ResponseEntity<?> updateRole(@RequestBody Role Role){        
        roleService.updateRole(Role);
        return ResponseEntity.ok("Role updated successfully");
    }
}
