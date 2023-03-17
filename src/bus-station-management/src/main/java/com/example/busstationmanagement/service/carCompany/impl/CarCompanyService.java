package com.example.busstationmanagement.service.carCompany.impl;

import com.example.busstationmanagement.model.CarCompany;
import com.example.busstationmanagement.repository.ICarCompanyRepository;
import com.example.busstationmanagement.service.carCompany.ICarCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarCompanyService implements ICarCompanyService {
    @Autowired
    private ICarCompanyRepository carCompanyRepository;
    @Override
    public List<CarCompany> findAll() {
        return this.carCompanyRepository.findAll();
    }
}
