package com.example.busstationmanagement.repository;

import com.example.busstationmanagement.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICityRepository extends JpaRepository<City, Long> {
}
