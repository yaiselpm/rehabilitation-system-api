package com.killer.rehabilitationsystemapi.domain.coders.consult;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TreatmentPlace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameTreatment;
    /**
     * 
     */
    public TreatmentPlace() {
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
     * @return the nameTreatment
     */
    public String getNameTreatment() {
        return nameTreatment;
    }
    /**
     * @param nameTreatment the nameTreatment to set
     */
    public void setNameTreatment(String nameTreatment) {
        this.nameTreatment = nameTreatment;
    }
    @Override
    public String toString() {
        return "TreatmentPlace [id=" + id + ", nameTreatment=" + nameTreatment + "]";
    }
    
}
