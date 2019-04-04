package com.capgemini.capstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.capstore.beans.DummyOrder;

public interface CapStoreDummyOrder extends JpaRepository<DummyOrder, Integer>{

}
