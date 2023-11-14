package com.killer.rehabilitationsystemapi.domain.coders.personal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameProvince;

    @OneToOne
    private Country country;
    /**
     * 
     */
    public Province() {
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
     * @return the nameProvince
     */
    public String getNameProvince() {
        return nameProvince;
    }
    /**
     * @param nameProvince the nameProvince to set
     */
    public void setNameProvince(String nameProvince) {
        this.nameProvince = nameProvince;
    }
    /**
     * @return the country
     */
    public Country getCountry() {
        return country;
    }
    /**
     * @param country the country to set
     */
    public void setCountry(Country country) {
        this.country = country;
    }
    
    @Override
    public String toString() {
        return "Province [id=" + id + ", nameProvince=" + nameProvince + ", country=" + country + "]";
    }    
    
}
