package com.itglance.springdatarest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CityAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String cityAddress;

    public String getCityAddress() {
        return cityAddress;
    }

    public void setCityAddress(String cityAddress) {
        this.cityAddress = cityAddress;
    }
}
