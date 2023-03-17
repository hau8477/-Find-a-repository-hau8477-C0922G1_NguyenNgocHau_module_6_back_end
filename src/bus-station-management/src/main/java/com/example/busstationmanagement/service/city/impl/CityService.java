package com.example.busstationmanagement.service.city.impl;

import com.example.busstationmanagement.model.City;
import com.example.busstationmanagement.repository.ICityRepository;
import com.example.busstationmanagement.service.city.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements ICityService {
    @Autowired
    private ICityRepository cityRepository;
    @Override
    public List<City> findAll() {
        return this.cityRepository.findAll();
    }
}
