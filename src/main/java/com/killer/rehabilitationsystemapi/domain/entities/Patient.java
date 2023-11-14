package com.killer.rehabilitationsystemapi.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.killer.rehabilitationsystemapi.domain.coders.patient.ConsultPlan;
import com.killer.rehabilitationsystemapi.domain.coders.patient.Reference;
import com.killer.rehabilitationsystemapi.domain.coders.patient.Remittance;

@Entity
// @JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})   
public class Patient extends Personal {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;
    @Column(unique = true)
    private Long clinicHistory;

    @OneToOne
    private Remittance remittance;
    
    @OneToOne
    private ConsultPlan consultPlan;
    
    @OneToOne
    private Reference reference;
    
    // @OneToOne
    // private Consult consult;
    
    
    /**
     * 
     */
    public Patient() { }
    

    /**
     * @param patientId
     */
    public Patient(Long patientId) {
        super();
        this.patientId = patientId;
    }


    /**
     * @return the patientId
     */
    public Long getPatientId() {
        return patientId;
    }

    /**
     * @param patientId the patientId to set
     */
    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    /**
     * @return the clinicHistory
     */
    public Long getClinicHistory() {
        return clinicHistory;
    }


    /**
     * @param clinicHistory the clinicHistory to set
     */
    public void setClinicHistory(Long clinicHistory) {
        this.clinicHistory = clinicHistory;
    }
    
    
    /**
     * @return the remittance
     */
    public Remittance getRemittance() {
        return remittance;
    }
    
    
    /**
     * @param remittance the remittance to set
     */
    public void setRemittance(Remittance remittance) {
        this.remittance = remittance;
    }
    
    /**
     * @return the consultPlan
     */
    public ConsultPlan getConsultPlan() {
        return consultPlan;
    }


    /**
     * @param consultPlan the consultPlan to set
     */
    public void setConsultPlan(ConsultPlan consultPlan) {
        this.consultPlan = consultPlan;
    }
    
    /**
     * @return the reference
     */
    public Reference getReference() {
        return reference;
    }


    /**
     * @param reference the reference to set
     */
    public void setReference(Reference reference) {
        this.reference = reference;
    }


    @Override
    public String toString() {
        return "Patient [patientId=" + patientId + ", clinicHistory=" + clinicHistory + ", remittance=" + remittance
                + ", consultPlan=" + consultPlan + ", reference=" + reference + "]";
    }
}
