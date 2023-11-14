package com.killer.rehabilitationsystemapi.services.coders.personal;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.killer.rehabilitationsystemapi.domain.coders.personal.Municipality;
import com.killer.rehabilitationsystemapi.persistence.repositories.coders.personal.MunicipalityRepository;

@Service
public class MunicipalityService {

    @Autowired
    private MunicipalityRepository municipalityRepository;
    
    @Transactional
    public Municipality createMunicipality(Municipality municipality) {

        return municipalityRepository.save(municipality);
        
    }

    @Transactional
    public Municipality updateMunicipality(Municipality municipality) {

        return (municipalityRepository.existsById(municipality.getId()))?municipalityRepository.save(municipality): municipality;       
        
    }

    public List<Municipality> getAllMunicipality() {
        return municipalityRepository.findAll();
    }

    public Municipality getMunicipality(Municipality municipality) {
        return municipalityRepository.getReferenceById(municipality.getId());
    }
}
