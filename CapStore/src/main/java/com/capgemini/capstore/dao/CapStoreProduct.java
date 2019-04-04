package com.capgemini.capstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.capstore.beans.Product;

public interface CapStoreProduct extends JpaRepository<Product, Integer>{

}
