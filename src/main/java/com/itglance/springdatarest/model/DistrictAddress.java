package com.itglance.springdatarest.model;


import javax.persistence.*;
import java.util.List;

@Entity
public class DistrictAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String districtAddress;

    @OneToMany
    @JoinColumn(name = "district_id")
    private List<CityAddress> cityAddress;

    public String getDistrictAddress() {
        return districtAddress;
    }

    public void setDistrictAddress(String districtAddress) {
        this.districtAddress = districtAddress;
    }

    public List<CityAddress> getCityAddress() {
        return cityAddress;
    }

    public void setCityAddress(List<CityAddress> cityAddress) {
        this.cityAddress = cityAddress;
    }
}
