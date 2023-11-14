package com.killer.rehabilitationsystemapi.services.coders.personal;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.killer.rehabilitationsystemapi.domain.coders.personal.Province;
import com.killer.rehabilitationsystemapi.persistence.repositories.coders.personal.ProvinceRepository;

@Service
public class ProvinceService {

    @Autowired
    private ProvinceRepository provinceRepository;
    
    @Transactional
    public Province createProvince(Province province) {

        return provinceRepository.save(province);
        
    }

    @Transactional
    public Province updateProvince(Province province) {

        return (provinceRepository.existsById(province.getId()))?provinceRepository.save(province): province;       
        
    }

    public List<Province> getAllProvince() {
        return provinceRepository.findAll();
    }

    public Province getProvince(Province province) {
        return provinceRepository.getReferenceById(province.getId());
    }
}
