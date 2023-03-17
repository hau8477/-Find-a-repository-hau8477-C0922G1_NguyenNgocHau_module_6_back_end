package com.example.busstationmanagement.service.carType.impl;

import com.example.busstationmanagement.model.CarType;
import com.example.busstationmanagement.repository.ICarTypeRepository;
import com.example.busstationmanagement.service.carType.ICarTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarTypeService implements ICarTypeService {
    @Autowired
    private ICarTypeRepository carTypeRepository;
    @Override
    public List<CarType> findAll() {
        return this.carTypeRepository.findAll();
    }
}
