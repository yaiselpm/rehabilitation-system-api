package com.killer.rehabilitationsystemapi.domain.coders.personal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameCountry;
    /**
     * 
     */
    public Country() {
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
     * @return the nameCountry
     */
    public String getNameCountry() {
        return nameCountry;
    }
    /**
     * @param nameCountry the nameCountry to set
     */
    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }
    @Override
    public String toString() {
        return "Country [id=" + id + ", nameCountry=" + nameCountry + "]";
    }

    
}
