package com.killer.rehabilitationsystemapi.domain.coders.consult;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Diagnostic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String diagnostic;
    
    /**
     * Constructs a new Diagnostic
     */
    public Diagnostic() {
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
     * @return the diagnostic
     */
    public String getDiagnostic() {
        return diagnostic;
    }
    /**
     * @param diagnostic the diagnostic to set
     */
    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }
    @Override
    public String toString() {
        return "Diagnostic [id=" + id + ", diagnostic=" + diagnostic + "]";
    }
    
}
