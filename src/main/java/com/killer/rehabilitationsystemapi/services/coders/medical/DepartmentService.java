package com.killer.rehabilitationsystemapi.services.coders.medical;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.killer.rehabilitationsystemapi.domain.coders.medical.Department;
import com.killer.rehabilitationsystemapi.persistence.repositories.coders.medical.DepartmentRepository;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;
    
    @Transactional
    public Department createDepartment(Department department) {

        return departmentRepository.save(department);
        
    }

    @Transactional
    public Department updateDepartment(Department department) {

        return (departmentRepository.existsById(department.getId()))?departmentRepository.save(department): department;       
        
    }

    public List<Department> getAllDepartment() {
        return departmentRepository.findAll();
    }

    public Department getDepartment(Department department) {
        return departmentRepository.getReferenceById(department.getId());
    }
}
