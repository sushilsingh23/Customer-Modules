package com.capgemini.capstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.capstore.beans.Offer;

public interface CapStoreOffer extends JpaRepository<Offer, Integer>{

}
