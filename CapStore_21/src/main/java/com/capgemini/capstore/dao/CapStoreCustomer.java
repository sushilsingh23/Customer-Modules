package com.capgemini.capstore.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.capstore.beans.Customer;

@Repository
public interface CapStoreCustomer extends JpaRepository<Customer, Integer>{

}
