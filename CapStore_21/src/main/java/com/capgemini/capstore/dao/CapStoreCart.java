package com.capgemini.capstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.capstore.beans.Cart;

@Repository
public interface CapStoreCart extends JpaRepository<Cart, Integer>{
	
}
