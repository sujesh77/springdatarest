package com.itglance.springdatarest.repository;

import com.itglance.springdatarest.model.CityAddress;
import com.itglance.springdatarest.model.DistrictAddress;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "districtaddress", path = "districtaddress")
public interface DistrictRepository extends CrudRepository<DistrictAddress,Long> {
}
