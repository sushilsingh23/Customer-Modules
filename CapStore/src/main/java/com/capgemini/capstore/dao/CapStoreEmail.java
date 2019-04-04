package com.capgemini.capstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.capstore.beans.Email;

public interface CapStoreEmail extends JpaRepository<Email, Integer>{

}
