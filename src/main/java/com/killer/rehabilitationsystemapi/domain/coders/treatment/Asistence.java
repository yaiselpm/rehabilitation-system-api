package com.killer.rehabilitationsystemapi.domain.coders.treatment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Asistence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String observations;

    @OneToOne
    private TreatmentPlan treatmentPlan;

    @OneToOne
    private Evolution evolution;
    /**
     * 
     */
    public Asistence() {
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
     * @return the observations
     */
    public String getObservations() {
        return observations;
    }
    /**
     * @param observations the observations to set
     */
    public void setObservations(String observations) {
        this.observations = observations;
    }
    @Override
    public String toString() {
        return "Asistence [id=" + id + ", observations=" + observations + "]";
    }
    
    
}
