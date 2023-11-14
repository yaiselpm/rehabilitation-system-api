package com.killer.rehabilitationsystemapi.domain.coders.personal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Municipality {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameMunicipality;
    @OneToOne
    private Province province;
    /**
     * 
     */
    public Municipality() {
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
     * @return the nameMunicipality
     */
    public String getNameMunicipality() {
        return nameMunicipality;
    }
    /**
     * @param nameMunicipality the nameMunicipality to set
     */
    public void setNameMunicipality(String nameMunicipality) {
        this.nameMunicipality = nameMunicipality;
    }
    @Override
    public String toString() {
        return "Municipality [id=" + id + ", nameMunicipality=" + nameMunicipality + ", province=" + province + "]";
    }
   
    
}
