package com.killer.rehabilitationsystemapi.domain.coders.patient;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameReference;
    /**
     * 
     */
    public Reference() {
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
     * @return the nameReference
     */
    public String getNameReference() {
        return nameReference;
    }
    /**
     * @param nameReference the nameReference to set
     */
    public void setNameReference(String nameReference) {
        this.nameReference = nameReference;
    }
    @Override
    public String toString() {
        return "Reference [id=" + id + ", nameReference=" + nameReference + "]";
    }
    
}
