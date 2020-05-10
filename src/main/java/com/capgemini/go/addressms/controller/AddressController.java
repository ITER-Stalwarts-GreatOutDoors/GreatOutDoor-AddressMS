package com.capgemini.go.addressms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.go.addressms.dto.AddressDTO;
import com.capgemini.go.addressms.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {	
	
	@Autowired
	AddressService addressService;
	
	@GetMapping("/viewALLAddress")
	List<AddressDTO>viewAllAddress(){
		return addressService.viewAllAddresss();
	}

	@PostMapping("/addAddress")
	String addAddress(@RequestBody AddressDTO address) {
		String status="Address added";
		
		if(addressService.addAddress(address)) {
		return status;
		}	
		return "fail to add Address";
	}
	
	@PostMapping("/updateAddress")
	String updateAddress(@RequestBody AddressDTO address) {
		String status="Address Updated";
		
		if(addressService.updateAddress(address)) {
			return status;
		}
		return "Failed to update Address";
	}
	
	
	@PostMapping("/deleteAddress")
	String deleteAddress(@RequestParam String addressId) {
		if(addressService.deleteAddress(addressId)) {
			return"Address Deleted Successfully";
		}
		return "error";
	}
}
