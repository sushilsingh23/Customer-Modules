package com.capgemini.capstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.capstore.beans.ReturnRequest;

public interface CapStoreReturnRequest extends JpaRepository<ReturnRequest, Integer>{

}
