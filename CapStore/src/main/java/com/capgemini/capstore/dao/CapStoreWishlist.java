package com.capgemini.capstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.capstore.beans.Wishlist;

public interface CapStoreWishlist extends JpaRepository<Wishlist, Integer>{

}
