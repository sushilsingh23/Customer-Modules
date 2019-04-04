package com.capgemini.capstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.capstore.beans.ProductFeedback;

public interface CapStoreProductFeedback extends JpaRepository<ProductFeedback, Integer>{

}
