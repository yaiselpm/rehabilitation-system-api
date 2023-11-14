package com.killer.rehabilitationsystemapi.services;

import java.util.List;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface CoderService <T>{

    // @Autowired
    // private CoderRepository<?> coderRepository;
    

    public List<?> getAll();
    public ResponseEntity<?> create(T t);
    public <T> T update(T t);
    public <T> T read(T t);
    public <T> void delete(T t);
}
