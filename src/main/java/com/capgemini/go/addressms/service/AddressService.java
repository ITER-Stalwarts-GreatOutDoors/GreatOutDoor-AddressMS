package com.capgemini.go.addressms.service;

import java.util.List;

import com.capgemini.go.addressms.dto.AddressDTO;

public interface AddressService {

	List<AddressDTO> viewAllAddresss();
	boolean addAddress(AddressDTO address);
	boolean updateAddress(AddressDTO address);
	boolean deleteAddress(String addressId);
	
}
