package com.killer.rehabilitationsystemapi.domain.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.killer.rehabilitationsystemapi.domain.coders.medical.Speciality;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})   
public class MedicalPerson extends Personal{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long doctorId;
    private String username;
    private String password;
    private Integer ageExperience;

    @OneToOne
    private Speciality speciality;

    // @OneToMany
    // private List<Consult> consults;

    /**
     * 
     */
    public MedicalPerson() {
    }
    /**
     * @return the id
     */
    public Long getId() {
        return doctorId;
    }
    /**
     * @param id the id to set
     */
    public void setId(Long doctorId) {
        this.doctorId = doctorId;
    }
    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }
    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }
    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * @return the ageExperience
     */
    public Integer getAgeExperience() {
        return ageExperience;
    }
    /**
     * @param ageExperience the ageExperience to set
     */
    public void setAgeExperience(Integer ageExperience) {
        this.ageExperience = ageExperience;
    }
    @Override
    public String toString() {
        return "MedicalPerson [id=" + doctorId + ", username=" + username + ", password=" + password + ", ageExperience="
                + ageExperience + "]";
    }
    
}
