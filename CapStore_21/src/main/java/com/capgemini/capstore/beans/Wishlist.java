package com.capgemini.capstore.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Wishlist")
@SequenceGenerator(name = "wishseq", initialValue = 1500, allocationSize = 1000)
public class Wishlist {

	@Id
	@Column(name = "wishid")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "wishseq")
	private int id;
	@OneToOne
	@NotNull
	@JoinColumn(name = "customerid")
	private Customer customer;
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@NotNull
	@JoinColumn(name = "productid")
	private Product product;
	@OneToOne
	@NotNull
	@JoinColumn(name = "merchantid")
	private Merchant merchant;
	@Column(name= "productprice")
	@NotNull
	private double productPrice;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Merchant getMerchant() {
		return merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}

}
