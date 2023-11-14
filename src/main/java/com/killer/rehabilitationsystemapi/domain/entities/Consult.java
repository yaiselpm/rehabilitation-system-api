package com.killer.rehabilitationsystemapi.domain.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.killer.rehabilitationsystemapi.domain.coders.consult.Deficience;
import com.killer.rehabilitationsystemapi.domain.coders.consult.DiagnosticType;
import com.killer.rehabilitationsystemapi.domain.coders.consult.Discapacity;
import com.killer.rehabilitationsystemapi.domain.coders.consult.TreatmentPlace;

@Entity
@Table(name = "consult")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Consult {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String motive;
    private Integer seccionNumber;

    @OneToOne(cascade = CascadeType.ALL)
    // @JoinColumn(name = "id", referencedColumnName = "patient_id")
    // @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})   
    private Patient patient;

    @ManyToOne
    private MedicalPerson medicalPerson;

    @OneToOne
    private TreatmentPlace treatmentPlace;

    @OneToOne
    private Discapacity discapacity;

    @OneToOne
    private Deficience deficience;

    @OneToOne
    private DiagnosticType diagnosticType;

    @OneToMany(mappedBy = "consult")
    private List<TreatmentsPerfom> treatmentsPerfom;

    /**
     * 
     */
    public Consult() {
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
     * @return the motive
     */
    public String getMotive() {
        return motive;
    }

    /**
     * @param motive the motive to set
     */
    public void setMotive(String motive) {
        this.motive = motive;
    }

    /**
     * @return the seccionNumber
     */
    public Integer getSeccionNumber() {
        return seccionNumber;
    }

    /**
     * @param seccionNumber the seccionNumber to set
     */
    public void setSeccionNumber(Integer seccionNumber) {
        this.seccionNumber = seccionNumber;
    }

    /**
     * @return the patient
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * @param patient the patient to set
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    /**
     * @return the medicalPerson
     */
    public MedicalPerson getMedicalPerson() {
        return medicalPerson;
    }

    /**
     * @param medicalPerson the medicalPerson to set
     */
    public void setMedicalPerson(MedicalPerson medicalPerson) {
        this.medicalPerson = medicalPerson;
    }

    /**
     * @return the treatmentPlace
     */
    public TreatmentPlace getTreatmentPlace() {
        return treatmentPlace;
    }

    /**
     * @param treatmentPlace the treatmentPlace to set
     */
    public void setTreatmentPlace(TreatmentPlace treatmentPlace) {
        this.treatmentPlace = treatmentPlace;
    }

    /**
     * @return the discapacity
     */
    public Discapacity getDiscapacity() {
        return discapacity;
    }

    /**
     * @param discapacity the discapacity to set
     */
    public void setDiscapacity(Discapacity discapacity) {
        this.discapacity = discapacity;
    }

    /**
     * @return the deficience
     */
    public Deficience getDeficience() {
        return deficience;
    }

    /**
     * @param deficience the deficience to set
     */
    public void setDeficience(Deficience deficience) {
        this.deficience = deficience;
    }

    /**
     * @return the diagnosticType
     */
    public DiagnosticType getDiagnosticType() {
        return diagnosticType;
    }

    /**
     * @param diagnosticType the diagnosticType to set
     */
    public void setDiagnosticType(DiagnosticType diagnosticType) {
        this.diagnosticType = diagnosticType;
    }

    /**
     * @return the treatmentsPerfom
     */
    public List<TreatmentsPerfom> getTreatmentsPerfom() {
        return treatmentsPerfom;
    }

    /**
     * @param treatmentsPerfom the treatmentsPerfom to set
     */
    public void setTreatmentsPerfom(List<TreatmentsPerfom> treatmentsPerfom) {
        this.treatmentsPerfom = treatmentsPerfom;
    }
    
    @Override
    public String toString() {
        return "Consult [id=" + id + ", motive=" + motive + ", seccionNumber=" + seccionNumber + "]";
    }
}
