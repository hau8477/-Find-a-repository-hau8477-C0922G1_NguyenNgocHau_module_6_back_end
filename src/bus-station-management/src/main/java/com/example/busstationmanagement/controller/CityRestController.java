package com.example.busstationmanagement.controller;

import com.example.busstationmanagement.model.City;
import com.example.busstationmanagement.service.city.ICityService;
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
@RequestMapping("/cities")
public class CityRestController {
    @Autowired
    private ICityService cityService;

    @GetMapping("")
    public ResponseEntity<List<City>> findAll() {
        List<City> cities = this.cityService.findAll();
        if (cities.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(cities, HttpStatus.OK);
    }
}
