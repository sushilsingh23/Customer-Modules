package com.capgemini.capstore.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.capstore.beans.Customer;
import com.capgemini.capstore.beans.Order;
import com.capgemini.capstore.beans.Wishlist;
import com.capgemini.capstore.service.ICustomerService;
import com.capgemini.exception.CustomerNotFoundException;

@RestController
public class CapStoreController {
	
	@Autowired
	ICustomerService customerService;
	
	@RequestMapping(value = "/updateName", method = RequestMethod.PUT)
	public Customer updateName(@RequestBody Customer customer) throws CustomerNotFoundException{
			return customerService.updateName(customer);
	}
	
	@RequestMapping(value = "/viewOrders/{id}", method = RequestMethod.GET)
	public List<Order> viewOrders(@PathVariable int id) throws CustomerNotFoundException{
			return customerService.getOrders(id);
	}
	
	@RequestMapping(value = "/deliveryStatus/{id}", method = RequestMethod.GET)
	public List<String> status(@PathVariable int id) throws CustomerNotFoundException{
			return customerService.getStatus(id);
	}
	
	@RequestMapping(value = "/getWishList/{id}", method = RequestMethod.GET)
	public List<Wishlist> WishList(@PathVariable int id) throws CustomerNotFoundException{
			return customerService.getWishlist(id);
	}
}