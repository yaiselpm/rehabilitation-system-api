package com.killer.rehabilitationsystemapi.services.coders.personal;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.killer.rehabilitationsystemapi.domain.coders.personal.Status;
import com.killer.rehabilitationsystemapi.persistence.repositories.coders.personal.StatusRepository;

@Service
public class StatusService {

    @Autowired
    private StatusRepository statusRepository;

    @Transactional
    public Status createStatus(Status status) {

        return statusRepository.save(status);
        
    }

    @Transactional
    public Status updateStatus(Status status) {

        return (statusRepository.existsById(status.getId()))?statusRepository.save(status): status;       
        
    }

    public List<Status> getAllStatus() {
        return statusRepository.findAll();
    }

    public Status getStatus(Status status) {
        return statusRepository.getReferenceById(status.getId());
    }
}
