package com.killer.rehabilitationsystemapi.services.coders.personal;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.killer.rehabilitationsystemapi.domain.coders.personal.Country;
import com.killer.rehabilitationsystemapi.persistence.repositories.coders.personal.CountryRepository;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;
    
    @Transactional
    public Country createCountry(Country country) {

        return countryRepository.save(country);
        
    }

    @Transactional
    public Country updateCountry(Country country) {

        return (countryRepository.existsById(country.getId()))?countryRepository.save(country): country;       
        
    }

    public List<Country> getAllCountry() {
        return countryRepository.findAll();
    }

    public Country getCountry(Country country) {
        return countryRepository.getReferenceById(country.getId());
    }
}
