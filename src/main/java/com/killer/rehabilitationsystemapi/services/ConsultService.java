package com.killer.rehabilitationsystemapi.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.killer.rehabilitationsystemapi.domain.coders.consult.Deficience;
import com.killer.rehabilitationsystemapi.domain.coders.consult.Diagnostic;
import com.killer.rehabilitationsystemapi.domain.coders.consult.DiagnosticType;
import com.killer.rehabilitationsystemapi.domain.coders.consult.Discapacity;
import com.killer.rehabilitationsystemapi.domain.coders.consult.TreatmentPlace;
import com.killer.rehabilitationsystemapi.domain.entities.Consult;
import com.killer.rehabilitationsystemapi.domain.entities.TreatmentsPerfom;
import com.killer.rehabilitationsystemapi.persistence.repositories.ConsultRepository;
import com.killer.rehabilitationsystemapi.services.coders.consult.DeficienceService;
import com.killer.rehabilitationsystemapi.services.coders.consult.DiagnosticService;
import com.killer.rehabilitationsystemapi.services.coders.consult.DiagnosticTypeService;
import com.killer.rehabilitationsystemapi.services.coders.consult.DiscapacityService;
import com.killer.rehabilitationsystemapi.services.coders.consult.TreatmentPlaceService;

@Service
public class ConsultService {

    @Autowired
    private ConsultRepository consultRepository;
    @Autowired
    private DiagnosticService diagnosticService;
    @Autowired
    private DiagnosticTypeService diagnosticTypeService;
    @Autowired
    private TreatmentPlaceService placeService;
    @Autowired
    private TreatmentsPerfomService perfomService;
    @Autowired
    private DeficienceService deficienceService;
    @Autowired
    private DiscapacityService discapacityService;

    @Transactional
    public Consult createConsult(Consult consult) {
        // Diagnostic diagnostic = diagnosticService.
        DiagnosticType diagnosticType = diagnosticTypeService.createDiagnosticType(consult.getDiagnosticType());
        Discapacity discapacity= discapacityService.createDiscapacity(consult.getDiscapacity());
        TreatmentPlace treatmentPlace= placeService.createTreatmentPlace(consult.getTreatmentPlace());
        Deficience deficience = deficienceService.createDeficience(consult.getDeficience());
        List<TreatmentsPerfom> treatmentsPerfom = perfomService.createPerfom(consult.getTreatmentsPerfom());
        consult.setDiagnosticType(diagnosticType);
        consult.setTreatmentPlace(treatmentPlace);
        consult.setTreatmentsPerfom(treatmentsPerfom);
        consult.setDeficience(deficience);
        consult.setDiscapacity(discapacity);
        return consultRepository.save(consult);
    }

    public Consult findConsult(Long id) {
        return  consultRepository.getReferenceById(id);        
    }

    @Transactional
    public Consult updateConsult(Consult consult){
        Consult auxConsult = consultRepository.getReferenceById(consult.getId());
        if (auxConsult == null) {
            return null;
        }else{
            auxConsult = consultRepository.save(consult);
        }
        return auxConsult;
    }

    public void deleteConsult(Consult consult){
        consultRepository.delete(consult);
    }
}
