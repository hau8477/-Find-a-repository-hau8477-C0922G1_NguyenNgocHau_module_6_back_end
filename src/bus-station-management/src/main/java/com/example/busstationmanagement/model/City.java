package com.example.busstationmanagement.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "startCity")
    private Set<CarRegistered> carRegisters;
    @OneToMany(mappedBy = "endCity")
    private Set<CarRegistered> carRegisterList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<CarRegistered> getCarRegisters() {
        return carRegisters;
    }

    public void setCarRegisters(Set<CarRegistered> carRegisters) {
        this.carRegisters = carRegisters;
    }

    public Set<CarRegistered> getCarRegisterList() {
        return carRegisterList;
    }

    public void setCarRegisterList(Set<CarRegistered> carRegisterList) {
        this.carRegisterList = carRegisterList;
    }
}
