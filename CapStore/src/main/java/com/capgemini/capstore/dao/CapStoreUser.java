package com.capgemini.capstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.capstore.beans.User;

public interface CapStoreUser extends JpaRepository<User, String>{

}
