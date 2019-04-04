package com.capgemini.capstore.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.capstore.beans.Cart;
import com.capgemini.capstore.beans.Customer;
import com.capgemini.capstore.beans.Merchant;
import com.capgemini.capstore.beans.Product;
import com.capgemini.capstore.dao.CapStoreCart;
import com.capgemini.capstore.dao.CapStoreCustomer;
import com.capgemini.capstore.dao.CapStoreMerchant;
import com.capgemini.capstore.dao.CapStoreProduct;

@Service
public class CartManageImpl implements CartManage {

	@Autowired
	CapStoreCart repo;
	@Autowired
	CapStoreProduct repoprod;
	@Autowired
	CapStoreCustomer repocust;
	@Autowired
	CapStoreMerchant repomer;

	 
	@Override
	public Product addCartItem(int pid, int custid,int merid) {
		Product product = repoprod.getOne(pid);
		Customer customer = repocust.getOne(custid);
		Merchant merchant=repomer.getOne(merid);
		Cart cart=new Cart();
		cart.setCustomer(customer);
		cart.setMerchant(merchant);
		cart.setProduct(product);
		cart.setSoftDelete("A");
		cart.setProductPrice(product.getProductPrice());
		cart.setQuantity(cart.getQuantity() + 1);
		repo.save(cart);
		return product;

	}

	@Override
	public Product removeCartItem(int pid, int custid) {
		Product product = repoprod.getOne(pid);
		Customer customer = repocust.getOne(custid);
		List<Cart> tempCart=repo.findAll();
		for(Cart temp : tempCart)
		{
			if(temp.getCustomer()==customer && temp.getSoftDelete()=="A" && temp.getProduct()==product)
			{
				repo.delete(temp);
				return product;
			}
		}
		return null;
	}

	@Override
	public List<Product> viewCart(int custid) {
		Customer customer = repocust.getOne(custid);
		List<Cart> tempCart=repo.findAll();
		List<Product> prod=new ArrayList<>();
		for(Cart temp : tempCart)
		{
			if(temp.getCustomer()==customer)
			{
				prod.add(temp.getProduct());
			}
		}	
		return prod;
	}

	@Override
	public Boolean minAmountCheck(int custid) {
		Customer customer = repocust.getOne(custid);
		List<Cart> tempCart=repo.findAll();
		List<Product> prod=new ArrayList<>();
		double amount=0.0;
		for(Cart temp : tempCart)
		{
			if(temp.getCustomer()==customer)
			{
				prod.add(temp.getProduct());
			}
		}	
		for(Cart temp : tempCart)
		{
			if(temp.getCustomer()==customer && temp.getSoftDelete()=="A")
			{
				for (Product product : prod) {
					amount += product.getProductPrice();
				}
			}
		}
		if (amount > 100) {
			return true;
		} else {
			return false;
		}
	}

}
