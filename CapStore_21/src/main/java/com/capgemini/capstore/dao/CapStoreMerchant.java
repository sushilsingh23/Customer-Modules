package com.capgemini.capstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.capstore.beans.Merchant;

@Repository
public interface CapStoreMerchant extends JpaRepository<Merchant, Integer> {
}

