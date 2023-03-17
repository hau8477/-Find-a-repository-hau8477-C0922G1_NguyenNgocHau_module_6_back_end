package com.example.busstationmanagement.controller;

import com.example.busstationmanagement.model.CarCompany;
import com.example.busstationmanagement.service.carCompany.ICarCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/car-companies")
public class CarCompanyRestController {
    @Autowired
    private ICarCompanyService carCompanyService;

    @GetMapping("")
    public ResponseEntity<List<CarCompany>> findAll() {
        List<CarCompany> carCompanies = this.carCompanyService.findAll();
        if(carCompanies.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(carCompanies, HttpStatus.OK);
    }
}
