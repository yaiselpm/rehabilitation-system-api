package com.killer.rehabilitationsystemapi.domain.coders.medical;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameUnit;
    /**
     * 
     */
    public Unit() {
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
     * @return the nameUnit
     */
    public String getNameUnit() {
        return nameUnit;
    }
    /**
     * @param nameUnit the nameUnit to set
     */
    public void setNameUnit(String nameUnit) {
        this.nameUnit = nameUnit;
    }
    @Override
    public String toString() {
        return "Unit [id=" + id + ", nameUnit=" + nameUnit + "]";
    }
    
}
