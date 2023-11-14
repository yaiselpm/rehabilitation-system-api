package com.killer.rehabilitationsystemapi.domain.entities;

import java.sql.Date;

import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

import com.killer.rehabilitationsystemapi.domain.coders.personal.BloodGroup;
import com.killer.rehabilitationsystemapi.domain.coders.personal.Municipality;

@MappedSuperclass
public class Personal {
    
    private String name;
    private String name2;
    private String lastname;
    private String lastname2;
    private Integer age;
    private String gender;
    private String address;
    private Date birthday;
    private Long idNumber;
    private Date incomeDate;
    private String registerBy;    
    @OneToOne
    private BloodGroup bloodGroup;
    @OneToOne
    private Municipality municipality;

    /**
     * Constructor for Personal
     */
    public Personal() {
    }
   
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the name2
     */
    public String getName2() {
        return name2;
    }
    /**
     * @param name2 the name2 to set
     */
    public void setName2(String name2) {
        this.name2 = name2;
    }
    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }
    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    /**
     * @return the lastname2
     */
    public String getLastname2() {
        return lastname2;
    }
    /**
     * @param lastname2 the lastname2 to set
     */
    public void setLastname2(String lastname2) {
        this.lastname2 = lastname2;
    }
    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }
    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }
    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }
    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }
    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * @return the birthday
     */
    public Date getBirthday() {
        return birthday;
    }
    /**
     * @param birthday the birthday to set
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    /**
     * @return the idNumber
     */
    public Long getIdNumber() {
        return idNumber;
    }
    /**
     * @param idNumber the idNumber to set
     */
    public void setIdNumber(Long idNumber) {
        this.idNumber = idNumber;
    }
    /**
     * @return the incomeDate
     */
    public Date getIncomeDate() {
        return incomeDate;
    }
    /**
     * @param incomeDate the incomeDate to set
     */
    public void setIncomeDate(Date incomeDate) {
        this.incomeDate = incomeDate;
    }
    /**
     * @return the registerBy
     */
    public String getRegisterBy() {
        return registerBy;
    }
    /**
     * @param registerBy the registerBy to set
     */
    public void setRegisterBy(String registerBy) {
        this.registerBy = registerBy;
    }
    
    
        /**
         * @return the bloodGroup
         */
        public BloodGroup getBloodGroup() {
            return bloodGroup;
        }
    
        /**
         * @param bloodGroup the bloodGroup to set
         */
        public void setBloodGroup(BloodGroup bloodGroup) {
            this.bloodGroup = bloodGroup;
        }
    
        /**
         * @return the municipality
         */
        public Municipality getMunicipality() {
            return municipality;
        }
    
        /**
         * @param municipality the municipality to set
         */
        public void setMunicipality(Municipality municipality) {
            this.municipality = municipality;
        }

    @Override
    public String toString() {
        return "Personal [name=" + name + ", name2=" + name2 + ", lastname=" + lastname + ", lastname2=" + lastname2
                + ", age=" + age + ", gender=" + gender + ", address=" + address + ", birthday=" + birthday
                + ", idNumber=" + idNumber + ", incomeDate=" + incomeDate + ", registerBy=" + registerBy
                + ", bloodGroup=" + bloodGroup + ", municipality=" + municipality + "]";
    }

  
    
    
}
