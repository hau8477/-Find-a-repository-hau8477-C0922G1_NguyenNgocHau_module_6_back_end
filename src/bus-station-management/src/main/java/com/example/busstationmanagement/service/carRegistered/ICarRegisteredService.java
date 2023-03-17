package com.example.busstationmanagement.service.carRegistered;

import com.example.busstationmanagement.model.CarRegistered;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICarRegisteredService {
    Page<CarRegistered> findAll(Pageable pageable);

    CarRegistered saveCarRegistered(CarRegistered carRegistered);

    boolean removeById(Long id);

    CarRegistered findById(Long id);

    CarRegistered updateCarRegistered(CarRegistered carRegistered);
}
