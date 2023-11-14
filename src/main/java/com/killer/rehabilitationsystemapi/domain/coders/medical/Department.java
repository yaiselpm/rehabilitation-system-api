package com.killer.rehabilitationsystemapi.domain.coders.medical;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Department {
    @Id
    private Long id;
    private String nameDepartment;

    @OneToOne
    private Unit unit;
    /**
     * 
     */
    public Department() {
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
     * @return the nameDepartment
     */
    public String getNameDepartment() {
        return nameDepartment;
    }
    /**
     * @param nameDepartment the nameDepartment to set
     */
    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }
    @Override
    public String toString() {
        return "Department [id=" + id + ", nameDepartment=" + nameDepartment + "]";
    }   
    
}
