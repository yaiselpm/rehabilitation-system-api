package com.killer.rehabilitationsystemapi.domain.coders.consult;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Deficience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String deficience;
    /**
     * 
     */
    public Deficience() {
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
     * @return the deficience
     */
    public String getDeficience() {
        return deficience;
    }
    /**
     * @param deficience the deficience to set
     */
    public void setDeficience(String deficience) {
        this.deficience = deficience;
    }
    
    @Override
    public String toString() {
        return "Deficience [id=" + id + ", deficience=" + deficience + "]";
    }
    
}
