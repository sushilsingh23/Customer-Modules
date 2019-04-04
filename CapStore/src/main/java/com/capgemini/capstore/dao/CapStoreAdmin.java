package com.capgemini.capstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.capstore.beans.Admin;

public interface CapStoreAdmin extends JpaRepository<Admin, Integer>{

}
