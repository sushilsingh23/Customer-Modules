package com.capgemini.capstore.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.capstore.beans.Customer;
import com.capgemini.capstore.beans.Order;
import com.capgemini.capstore.beans.Wishlist;
import com.capgemini.capstore.dao.CapStoreCustomer;
import com.capgemini.capstore.dao.CapStoreOrder;
import com.capgemini.capstore.dao.CapStoreWishlist;
import com.capgemini.exception.CustomerNotFoundException;

@Service
public class CustomerService implements ICustomerService {

	@Autowired
	CapStoreCustomer customerDAO;
	
	@Autowired
	CapStoreOrder customerOrderDAO;
	
	@Autowired
	CapStoreWishlist customerWishListDAO;
	
	@Override
	public Customer updateName(Customer customer) throws CustomerNotFoundException
	{
		if(!customerDAO.existsById(customer.getCustomerId()))
			throw new CustomerNotFoundException("Customer not found for update name");
		else {
			
			Customer new1  = customerDAO.findById(customer.getCustomerId()).get();
			new1.setCustomerName(customer.getCustomerName());
			customerDAO.saveAndFlush(new1);
			return new1;
		}
	}


	@Override
	public List<Order> getOrders(int id) throws CustomerNotFoundException {
		List<Order> returnig = new ArrayList<Order>();
		if(!customerDAO.existsById(id))
			throw new CustomerNotFoundException("customer not found");
		else {
			List<Order> orders = customerOrderDAO.findAll();
			for(Order i: orders)
			{
				if(i.getCustomer().getCustomerId() == id)
					returnig.add(i);
			}
			return returnig;
		}
	}


	@Override
	public List<String> getStatus(int id) throws CustomerNotFoundException {
		List<String> status = new ArrayList<>();
		if(!customerDAO.existsById(id))
			throw new CustomerNotFoundException("customer not found");
		else
		{
			List<Order> orders = customerOrderDAO.findAll();
			for(Order i: orders)
			{
				if(i.getCustomer().getCustomerId() == id)
					status.add(i.getDeliveryStatus());
			}
		}
		return status;
	}


	@Override
	public List<Wishlist> getWishlist(int id) throws CustomerNotFoundException {
		List<Wishlist> wishlist = new ArrayList<>();
		if(!customerDAO.existsById(id))
			throw new CustomerNotFoundException("customer not found");
		else {
			List<Wishlist> all = customerWishListDAO.findAll();
			for(Wishlist i:all)
			{
				if(i.getCustomer().getCustomerId() == id)
					wishlist.add(i);
			}
		}
		return wishlist;
	}
	
	
	
	
	
}