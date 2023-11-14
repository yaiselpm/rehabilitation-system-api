package com.killer.rehabilitationsystemapi.domain.coders.medical;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Speciality {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameSpeciality;

    @OneToOne
    private Department department;
    
    /**
     * 
     */
    public Speciality() {
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
     * @return the nameSpeciality
     */
    public String getNameSpeciality() {
        return nameSpeciality;
    }

    /**
     * @param nameSpeciality the nameSpeciality to set
     */
    public void setNameSpeciality(String nameSpeciality) {
        this.nameSpeciality = nameSpeciality;
    }

    @Override
    public String toString() {
        return "Speciality [id=" + id + ", nameSpeciality=" + nameSpeciality + "]";
    }
    
    
}
