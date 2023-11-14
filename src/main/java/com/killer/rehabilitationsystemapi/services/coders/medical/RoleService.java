package com.killer.rehabilitationsystemapi.services.coders.medical;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.killer.rehabilitationsystemapi.domain.coders.medical.Role;
import com.killer.rehabilitationsystemapi.persistence.repositories.coders.medical.RoleRepository;

@Service
public class RoleService {
    
    @Autowired
    private RoleRepository roleRepository;
    
    @Transactional
    public Role createRole(Role role) {

        return roleRepository.save(role);
        
    }

    @Transactional
    public Role updateRole(Role role) {

        return (roleRepository.existsById(role.getId()))?roleRepository.save(role): role;       
        
    }

    public List<Role> getAllRole() {
        return roleRepository.findAll();
    }

    public Role getRole(Role role) {
        return roleRepository.getReferenceById(role.getId());
    }
}
