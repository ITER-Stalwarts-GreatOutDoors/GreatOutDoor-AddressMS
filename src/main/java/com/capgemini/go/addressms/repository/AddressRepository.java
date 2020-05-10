package com.capgemini.go.addressms.repository;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.go.addressms.dto.AddressDTO;

public interface AddressRepository extends CrudRepository<AddressDTO,String> {

}
