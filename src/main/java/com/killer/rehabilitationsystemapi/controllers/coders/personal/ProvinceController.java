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

import com.killer.rehabilitationsystemapi.domain.coders.personal.Province;
import com.killer.rehabilitationsystemapi.services.coders.personal.ProvinceService;

@RestController
@RequestMapping("/provinces")
public class ProvinceController {
    
    @Autowired
    private ProvinceService provinceService;

     @GetMapping("/search")
    public ResponseEntity<?> findProvince(@RequestBody Province province) {
        Province pa=   provinceService.getProvince(province);      
        // if(pa==null)  {
        //     return ResponseEntity.ok("Patient not found");
        // }
        // return ResponseEntity.ok(pa);
        
        return (pa==null)? ResponseEntity.notFound().build(): ResponseEntity.ok(pa);       
    }
    @PostMapping("/province")
    public ResponseEntity<?> createProvince(@RequestBody Province province){
           provinceService.createProvince(province);
        return ResponseEntity.ok("Province created successfully");
    }
    @PutMapping("/province")
    public ResponseEntity<?> updateProvince(@RequestBody Province province){        
        provinceService.updateProvince(province);
        return ResponseEntity.ok("Province updated successfully");
    }

    @GetMapping("/province")
    public List<Province> listAllProvince() {
        return provinceService.getAllProvince();
    }
}
