package com.killer.rehabilitationsystemapi.services.coders.patient;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.killer.rehabilitationsystemapi.domain.coders.patient.Remittance;
import com.killer.rehabilitationsystemapi.persistence.repositories.coders.patient.RemittanceRepository;

@Service
public class RemittanceService {

    @Autowired
    private RemittanceRepository remittanceRepository;
    
    @Transactional
    public Remittance createRemittance(Remittance remittance) {

        return remittanceRepository.save(remittance);
        
    }

    @Transactional
    public Remittance updateRemittance(Remittance remittance) {

        return (remittanceRepository.existsById(remittance.getId()))?remittanceRepository.save(remittance): remittance;       
        
    }

    public List<Remittance> getAllRemittance() {
        return remittanceRepository.findAll();
    }

    public Remittance getRemittance(Remittance remittance) {
        return remittanceRepository.getReferenceById(remittance.getId());
    }
}
