package com.capgemini.capstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.capstore.beans.Product;
import com.capgemini.capstore.exceptions.MinimumCostOfPurcahseNotSatisfied;
import com.capgemini.capstore.service.CartManageImpl;


@RestController
public class MyController {
	
	@Autowired
	private CartManageImpl cm;
	
	@RequestMapping(method = RequestMethod.POST, value = "/addcartitem/{pid}/{custid}/{merid}")
	public void addCartItem(@PathVariable int pid, @PathVariable int custid,@PathVariable int merid)
	{
		cm.addCartItem(pid, custid, merid);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/removecartitem")
	public void removeCartItem(@PathVariable int pid,@PathVariable int custid)
	{
		cm.removeCartItem(pid, custid);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/viewcart")
	public void viewCart(int custid)
	{
		cm.viewCart(custid);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/minAmountCheck")
	public void minAmountCheck(int custid)
	{
		cm.minAmountCheck(custid);
	}
}
