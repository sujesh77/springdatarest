package com.itglance.springdatarest.resource;

import com.itglance.springdatarest.model.DistrictAddress;
import com.itglance.springdatarest.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityResource {

    @Autowired
    private DistrictRepository districtRepository;

    @GetMapping("/api/city")
    public ResponseEntity<Iterable<DistrictAddress>> getCity(){
        return ResponseEntity.ok().body(districtRepository.findAll());
    }
}
