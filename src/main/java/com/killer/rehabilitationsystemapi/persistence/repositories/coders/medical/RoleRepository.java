package com.killer.rehabilitationsystemapi.persistence.repositories.coders.medical;

import org.springframework.data.jpa.repository.JpaRepository;

import com.killer.rehabilitationsystemapi.domain.coders.medical.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
    
}
