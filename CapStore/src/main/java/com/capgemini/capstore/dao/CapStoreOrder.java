package com.capgemini.capstore.dao;



import org.springframework.data.jpa.repository.JpaRepository;


import com.capgemini.capstore.beans.Order;

public interface CapStoreOrder extends JpaRepository<Order, Integer>{

	
}
