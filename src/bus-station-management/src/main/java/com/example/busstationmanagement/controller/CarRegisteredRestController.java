package com.example.busstationmanagement.controller;

import com.example.busstationmanagement.dto.CarRegisteredDTO;
import com.example.busstationmanagement.model.CarRegistered;
import com.example.busstationmanagement.service.carRegistered.ICarRegisteredService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/car-registeres")
public class CarRegisteredRestController {
    @Autowired
    private ICarRegisteredService carRegisteredService;

    @GetMapping("")
    public ResponseEntity<Page<CarRegistered>> findAll(@RequestParam(required = false, defaultValue = "5") int size,
                                                       @RequestParam(required = false, defaultValue = "0") int page) {
        Pageable pageable = PageRequest.of(page, size);
        Page<CarRegistered> carRegisters = this.carRegisteredService.findAll(pageable);
        if (carRegisters.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(carRegisters, HttpStatus.OK);
    }

    @PostMapping(value = "/save", consumes = "application/json")
    public ResponseEntity<CarRegistered> addCarRegistered(@RequestBody CarRegisteredDTO carRegisteredDTO) {
        CarRegistered carRegistered = new CarRegistered();
        BeanUtils.copyProperties(carRegisteredDTO, carRegistered);

        CarRegistered savedCarRegistered = this.carRegisteredService.saveCarRegistered(carRegistered);
        if (savedCarRegistered == null) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
        return new ResponseEntity<>(savedCarRegistered, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteCarRegistered(@PathVariable Long id) {
        CarRegistered optionalCarRegistered = carRegisteredService.findById(id);
        if (optionalCarRegistered == null) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
        if (!carRegisteredService.removeById(id)) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<CarRegistered> updateCarRegistered(@PathVariable Long id, @RequestBody CarRegisteredDTO carRegisteredDTO) {
        CarRegistered optionalCarRegistered = carRegisteredService.findById(id);
        if (optionalCarRegistered == null) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
        CarRegistered carRegistered = new CarRegistered();
        BeanUtils.copyProperties(carRegisteredDTO, carRegistered);
        CarRegistered updatedCarRegistered = carRegisteredService.updateCarRegistered(carRegistered);
        if (updatedCarRegistered == null) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
        return new ResponseEntity<>(updatedCarRegistered, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarRegistered> findById(@PathVariable Long id) {
        CarRegistered optionalCarRegistered = carRegisteredService.findById(id);
        if (optionalCarRegistered == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(optionalCarRegistered, HttpStatus.OK);
    }
}
