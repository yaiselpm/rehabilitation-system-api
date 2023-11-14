package com.killer.rehabilitationsystemapi.controllers.coders.personal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.killer.rehabilitationsystemapi.domain.coders.personal.Country;
import com.killer.rehabilitationsystemapi.services.coders.personal.CountryService;

@RestController
@RequestMapping("/country")
public class CountryController {
    
    @Autowired
    private CountryService countryService;

     @GetMapping("/search")
    public ResponseEntity<?> findCountry(@RequestBody Country country) {
        Country pa=   countryService.getCountry(country);      
        // if(pa==null)  {
        //     return ResponseEntity.ok("Patient not found");
        // }
        // return ResponseEntity.ok(pa);
        
        return (pa==null)? ResponseEntity.notFound().build(): ResponseEntity.ok(pa);       
    }
    @PostMapping("/country")
    public ResponseEntity<?> createCountry(@RequestBody Country country){
           countryService.createCountry(country);
        return ResponseEntity.ok("Country created successfully");
    }

    @PutMapping("/country")
    public ResponseEntity<?> updateCountry(@RequestBody Country country){        
        countryService.updateCountry(country);
        return ResponseEntity.ok("Country updated successfully");
    }

     @GetMapping("/country")
    public List<Country> listAllCountries() {
        return countryService.getAllCountry();
    }
}
