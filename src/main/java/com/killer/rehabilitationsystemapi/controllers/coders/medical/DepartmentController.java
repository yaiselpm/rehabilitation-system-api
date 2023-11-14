package com.killer.rehabilitationsystemapi.controllers.coders.medical;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.killer.rehabilitationsystemapi.domain.coders.medical.Department;
import com.killer.rehabilitationsystemapi.services.coders.medical.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    
    @Autowired
    private DepartmentService departmentService;

     @GetMapping("/search")
    public ResponseEntity<?> findDepartment(@RequestBody Department department) {
        Department pa=   departmentService.getDepartment(department);      
        // if(pa==null)  {
        //     return ResponseEntity.ok("Patient not found");
        // }
        // return ResponseEntity.ok(pa);
        
        return (pa==null)? ResponseEntity.notFound().build(): ResponseEntity.ok(pa);       
    }
    @PostMapping("/department")
    public ResponseEntity<?> createDepartment(@RequestBody Department department){
           departmentService.createDepartment(department);
        return ResponseEntity.ok("Department created successfully");
    }

    @PutMapping("/department")
    public ResponseEntity<?> updateDepartment(@RequestBody Department department){        
        departmentService.updateDepartment(department);
        return ResponseEntity.ok("Department updated successfully");
    }
}
