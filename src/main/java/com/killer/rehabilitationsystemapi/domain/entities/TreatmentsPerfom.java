package com.killer.rehabilitationsystemapi.domain.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.killer.rehabilitationsystemapi.domain.coders.treatment.Treatment;
import com.killer.rehabilitationsystemapi.domain.coders.treatment.TreatmentPlan;


@Entity
@Table(name = "treatmentsPerfom")
public class TreatmentsPerfom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer seccionNumber;
    private Date hour;

    @ManyToOne
    private Consult consult;

    @OneToMany(mappedBy = "treatmentsPerfom")
    private List<TreatmentPlan> treatmentPlan;

    @OneToOne
    private Treatment treatment;
    /**
     * 
     */
    public TreatmentsPerfom() {
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
     * @return the hour
     */
    public Date getHour() {
        return hour;
    }
    /**
     * @param hour the hour to set
     */
    public void setHour(Date hour) {
        this.hour = hour;
    }
    @Override
    public String toString() {
        return "TreatmentsPerfom [id=" + id + ", seccionNumber=" + seccionNumber + ", hour=" + hour + "]";
    }

    
    
}
