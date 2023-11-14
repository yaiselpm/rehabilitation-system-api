package com.killer.rehabilitationsystemapi.domain.coders.treatment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Treatment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameTreatment;
    private Integer duration;
    /**
     * 
     */
    public Treatment() {
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
    /**
     * @return the duration
     */
    public Integer getDuration() {
        return duration;
    }
    /**
     * @param duration the duration to set
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }
    @Override
    public String toString() {
        return "Treatment [id=" + id + ", nameTreatment=" + nameTreatment + ", duration=" + duration + "]";
    }
    
    
}
