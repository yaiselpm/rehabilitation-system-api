package com.killer.rehabilitationsystemapi.services.coders.consult;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.killer.rehabilitationsystemapi.domain.coders.consult.Diagnostic;
import com.killer.rehabilitationsystemapi.persistence.repositories.coders.consult.DiagnosticRepository;
import com.killer.rehabilitationsystemapi.services.CoderService;

@Service
public class DiagnosticService implements CoderService<Diagnostic>{

    @Autowired
    private DiagnosticRepository diagnosticRepository;

    @Override
    public ResponseEntity<?> create(Diagnostic t) {
        Diagnostic diagnostic2= t;
        Diagnostic diag = diagnosticRepository.save(diagnostic2);
        return ResponseEntity.ok("Diagnostic created "+ diag);
    }

    @Override
    public <T> void delete(T t) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<?> getAll() {
        
        return diagnosticRepository.findAll();
    }

    @Override
    public <T> T read(T t) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <T> T update(T t) {
        // TODO Auto-generated method stub
        return null;
    }


   
}
