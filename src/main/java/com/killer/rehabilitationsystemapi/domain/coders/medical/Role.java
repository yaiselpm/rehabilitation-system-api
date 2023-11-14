package com.killer.rehabilitationsystemapi.domain.coders.medical;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role {
    @Id
    private Long id;
    private String nameRole;
    /**
     * 
     */
    public Role() {
    }
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * @return the nameRole
     */
    public String getNameRole() {
        return nameRole;
    }
    /**
     * @param nameRole the nameRole to set
     */
    public void setNameRole(String nameRole) {
        this.nameRole = nameRole;
    }
    @Override
    public String toString() {
        return "Role [id=" + id + ", nameRole=" + nameRole + "]";
    }
    
}
