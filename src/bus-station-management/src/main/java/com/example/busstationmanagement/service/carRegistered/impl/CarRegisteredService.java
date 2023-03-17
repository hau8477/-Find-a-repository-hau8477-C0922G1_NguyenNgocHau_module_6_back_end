package com.example.busstationmanagement.service.carRegistered.impl;

import com.example.busstationmanagement.model.CarRegistered;
import com.example.busstationmanagement.repository.ICarRegisteredRepository;
import com.example.busstationmanagement.service.carRegistered.ICarRegisteredService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CarRegisteredService implements ICarRegisteredService {
    @Autowired
    private ICarRegisteredRepository carRegisteredRepository;

    @Override
    public Page<CarRegistered> findAll(Pageable pageable) {
        return this.carRegisteredRepository.findAll1(pageable);
    }

    @Override
    public CarRegistered saveCarRegistered(CarRegistered carRegistered) {
        return this.carRegisteredRepository.save(carRegistered);
    }

    @Override
    public boolean removeById(Long id) {
        this.carRegisteredRepository.deleteById(id);
        return true;
    }

    @Override
    public CarRegistered findById(Long id) {
        return this.carRegisteredRepository.findById(id).orElse(null);
    }

    @Override
    public CarRegistered updateCarRegistered(CarRegistered carRegistered) {
       return this.carRegisteredRepository.save(carRegistered);
    }
}
