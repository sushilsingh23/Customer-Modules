package com.capgemini.capstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.capstore.beans.MerchantFeedback;

public interface CapStoreMerchantFeedback extends JpaRepository<MerchantFeedback, Integer>{

}
