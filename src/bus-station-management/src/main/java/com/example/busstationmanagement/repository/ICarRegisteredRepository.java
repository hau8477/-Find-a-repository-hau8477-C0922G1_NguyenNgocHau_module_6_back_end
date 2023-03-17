package com.example.busstationmanagement.repository;

import com.example.busstationmanagement.model.CarRegistered;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ICarRegisteredRepository extends JpaRepository<CarRegistered, Long> {
    @Query(value = "SELECT * FROM car_registered", nativeQuery = true)
    Page<CarRegistered> findAll1(Pageable pageable);

//    boolean saveCarRegistered(CarRegistered carRegistered);
//
//    boolean removeById(Long id);

//    CarRegistered findById(Long id);

//    boolean updateCarRegistered(CarRegistered carRegistered);
}
