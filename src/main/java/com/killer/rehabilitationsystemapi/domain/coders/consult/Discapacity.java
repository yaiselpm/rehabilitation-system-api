package com.killer.rehabilitationsystemapi.domain.coders.consult;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Discapacity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameDiscapacity;
    /**
     * 
     */
    public Discapacity() {
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
     * @return the nameDiscapacity
     */
    public String getNameDiscapacity() {
        return nameDiscapacity;
    }
    /**
     * @param nameDiscapacity the nameDiscapacity to set
     */
    public void setNameDiscapacity(String nameDiscapacity) {
        this.nameDiscapacity = nameDiscapacity;
    }
    @Override
    public String toString() {
        return "Discapacity [id=" + id + ", nameDiscapacity=" + nameDiscapacity + "]";
    }
    
}
