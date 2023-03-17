package com.example.busstationmanagement.controller;

import com.example.busstationmanagement.model.CarType;
import com.example.busstationmanagement.service.carType.ICarTypeService;
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
@RequestMapping("/car-type")
public class CarTypeRestController {
    @Autowired
    private ICarTypeService carTypeService;

    @GetMapping("")
    public ResponseEntity<List<CarType>> findAll() {
        List<CarType> carTypes = this.carTypeService.findAll();
        if (carTypes.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(carTypes, HttpStatus.OK);
    }
}
