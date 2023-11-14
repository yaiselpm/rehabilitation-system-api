package com.killer.rehabilitationsystemapi.services.coders.consult;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.killer.rehabilitationsystemapi.domain.coders.consult.DiagnosticType;
import com.killer.rehabilitationsystemapi.persistence.repositories.coders.consult.DiagnosticTypeRepository;

@Service
public class DiagnosticTypeService {

    @Autowired
    private DiagnosticTypeRepository diagnosticTypeRepository;
    
    @Transactional
    public DiagnosticType createDiagnosticType(DiagnosticType diagnosticType) {

        return diagnosticTypeRepository.save(diagnosticType);
        
    }

    @Transactional
    public DiagnosticType updateDiagnosticType(DiagnosticType diagnosticType) {

        return (diagnosticTypeRepository.existsById(diagnosticType.getId()))?diagnosticTypeRepository.save(diagnosticType): diagnosticType;       
        
    }


    public List<DiagnosticType> getAllDiagnosticType() {
        return diagnosticTypeRepository.findAll();
    }

    public DiagnosticType getDiagnosticType(DiagnosticType diagnosticType) {
        return diagnosticTypeRepository.getReferenceById(diagnosticType.getId());
    }
}
