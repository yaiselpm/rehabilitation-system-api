package com.killer.rehabilitationsystemapi.services.coders.medical;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.killer.rehabilitationsystemapi.domain.coders.medical.Unit;
import com.killer.rehabilitationsystemapi.persistence.repositories.coders.medical.UnitRepository;

@Service
public class UnitService {
    
    @Autowired
    private UnitRepository unitRepository;
    
    @Transactional
    public Unit createUnit(Unit unit) {

        return unitRepository.save(unit);
        
    }

    @Transactional
    public Unit updateUnit(Unit unit) {

        return (unitRepository.existsById(unit.getId()))?unitRepository.save(unit): unit;       
        
    }

    public List<Unit> getAllUnit() {
        return unitRepository.findAll();
    }

    public Unit getUnit(Unit unit) {
        return unitRepository.getReferenceById(unit.getId());
    }
}
