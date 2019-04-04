package com.capgemini.capstore.service;


import java.util.List;

import com.capgemini.capstore.beans.Customer;
import com.capgemini.capstore.beans.Order;
import com.capgemini.capstore.beans.Wishlist;
import com.capgemini.exception.CustomerNotFoundException;

public interface ICustomerService {

	Customer updateName(Customer customer) throws CustomerNotFoundException;
	
	List<Order> getOrders(int id) throws CustomerNotFoundException;
	
	List<String> getStatus(int id) throws CustomerNotFoundException;
	
	List<Wishlist> getWishlist(int id) throws CustomerNotFoundException;

}