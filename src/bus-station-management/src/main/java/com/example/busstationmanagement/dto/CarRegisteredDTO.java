package com.example.busstationmanagement.dto;

import com.example.busstationmanagement.model.CarCompany;
import com.example.busstationmanagement.model.CarType;
import com.example.busstationmanagement.model.City;

public class CarRegisteredDTO {
    private String numberPlate;
    private CarType carType;
    private CarCompany carCompany;
    private City startCity;
    private City endCity;
    private String phoneNumber;
    private String email;
    private String startHour;
    private String endHour;

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public CarCompany getCarCompany() {
        return carCompany;
    }

    public void setCarCompany(CarCompany carCompany) {
        this.carCompany = carCompany;
    }

    public City getStartCity() {
        return startCity;
    }

    public void setStartCity(City startCity) {
        this.startCity = startCity;
    }

    public City getEndCity() {
        return endCity;
    }

    public void setEndCity(City endCity) {
        this.endCity = endCity;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStartHour() {
        return startHour;
    }

    public void setStartHour(String startHour) {
        this.startHour = startHour;
    }

    public String getEndHour() {
        return endHour;
    }

    public void setEndHour(String endHour) {
        this.endHour = endHour;
    }
}
