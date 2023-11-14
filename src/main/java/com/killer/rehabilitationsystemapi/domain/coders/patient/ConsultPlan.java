package com.killer.rehabilitationsystemapi.domain.coders.patient;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.killer.rehabilitationsystemapi.domain.entities.MedicalPerson;

@Entity
public class ConsultPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToOne(fetch = FetchType.LAZY)
    private MedicalPerson doctor;
    // @DateTimeFormat(pattern = "yyyy-mm-dd")
    @Column(columnDefinition = "Date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date day;
    private String time;
    /**
     * 
     */
    public ConsultPlan() {
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
     * @return the doctor
     */
    public MedicalPerson getDoctor() {
        return doctor;
    }
    /**
     * @param doctor the doctor to set
     */
    public void setDoctor(MedicalPerson doctor) {
        this.doctor = doctor;
    } 
    /**
     * @return the day
     */
    public Date getDay() {
        return day;
    }
    /**
     * @param day the day to set
     */
    public void setDay(Date day) {
        this.day = day;
    }
    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }
    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "ConsultPlan [id=" + id + ", doctor=" + doctor + ", day=" + day + ", time=" + time + "]";
    }
    
    
}
