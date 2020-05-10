package com.capgemini.go.addressms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.go.addressms.dto.AddressDTO;
import com.capgemini.go.addressms.repository.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	AddressRepository addressRepository;

	@Override
	public List<AddressDTO> viewAllAddresss() {
		return (List<AddressDTO>)addressRepository.findAll();
	}

	@Override
	public boolean addAddress(AddressDTO address) {
		addressRepository.save(address);
		return true;
	}

	@Override
	public boolean updateAddress(AddressDTO address) {
		Optional<AddressDTO> find=addressRepository.findById(address.getAddressId());
		if(find.isPresent()) {
			addressRepository.save(address);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteAddress(String addressId) {
		addressRepository.deleteById(addressId);
		return true;
	}




	}
