package com.killer.rehabilitationsystemapi.domain.coders.patient;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// Entity para los egresos
@Entity
public class Remittance {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private String rehabilitated;
    /**
     * 
     */
    public Remittance() {
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
     * @return the date
     */
    public Date getDate() {
        return date;
    }
    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }
    /**
     * @return the rehabilitated
     */
    public String getRehabilitated() {
        return rehabilitated;
    }
    /**
     * @param rehabilitated the rehabilitated to set
     */
    public void setRehabilitated(String rehabilitated) {
        this.rehabilitated = rehabilitated;
    }
    @Override
    public String toString() {
        return "Remittance [id=" + id + ", date=" + date + ", rehabilitated=" + rehabilitated + "]";
    }
    
}
