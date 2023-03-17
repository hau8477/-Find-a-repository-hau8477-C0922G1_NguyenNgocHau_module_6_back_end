package com.example.busstationmanagement.repository;

import com.example.busstationmanagement.model.CarType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICarTypeRepository extends JpaRepository<CarType, Long> {
}
