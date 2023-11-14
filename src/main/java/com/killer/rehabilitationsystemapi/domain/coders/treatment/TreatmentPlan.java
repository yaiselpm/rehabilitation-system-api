package com.killer.rehabilitationsystemapi.domain.coders.treatment;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.killer.rehabilitationsystemapi.domain.entities.TreatmentsPerfom;

@Entity
public class TreatmentPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private Integer time;

    @ManyToOne()
    private TreatmentsPerfom treatmentsPerfom;

    // @OneToOne
    // private Asistence asistence;
    /**
     * 
     */
    public TreatmentPlan() {
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
     * @return the time
     */
    public Integer getTime() {
        return time;
    }
    /**
     * @param time the time to set
     */
    public void setTime(Integer time) {
        this.time = time;
    }
    @Override
    public String toString() {
        return "TreatmentPlan [id=" + id + ", date=" + date + ", time=" + time + "]";
    }
    
}
