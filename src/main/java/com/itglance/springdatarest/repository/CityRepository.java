package com.itglance.springdatarest.repository;

import com.itglance.springdatarest.model.CityAddress;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "cityaddress", path = "cityaddress")
public interface CityRepository extends CrudRepository<CityAddress,Long> {
}
