package com.capgemini.capstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.capstore.beans.Cart;

public interface CapStoreCart extends JpaRepository<Cart, Integer>{

}
