package com.example.busstationmanagement.repository;

import com.example.busstationmanagement.model.CarCompany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICarCompanyRepository extends JpaRepository<CarCompany, Long> {
}
