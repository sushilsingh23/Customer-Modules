package com.capgemini.capstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.capstore.beans.Merchant;

public interface CapStoreMerchant extends JpaRepository<Merchant, Integer> {
}

