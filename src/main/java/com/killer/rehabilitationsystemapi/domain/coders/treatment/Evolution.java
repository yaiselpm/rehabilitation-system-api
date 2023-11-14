package com.killer.rehabilitationsystemapi.domain.coders.treatment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Evolution {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameEvolution;
    /**
     * 
     */
    public Evolution() {
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
     * @return the nameEvolution
     */
    public String getNameEvolution() {
        return nameEvolution;
    }
    /**
     * @param nameEvolution the nameEvolution to set
     */
    public void setNameEvolution(String nameEvolution) {
        this.nameEvolution = nameEvolution;
    }
    @Override
    public String toString() {
        return "Evolution [id=" + id + ", nameEvolution=" + nameEvolution + "]";
    }
    
}
