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
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Productfeedback")
@SequenceGenerator(name = "prodfseq", initialValue = 6000, allocationSize = 1000)
public class ProductFeedback {

	@Id
	@Column(name = "pfid")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prodfseq")
	private int id;
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@NotNull
	@JoinColumn(name = "productid")
	private Product product;
	@Column(name = "productfeedback")
	@Size(max = 100)
	private String productFeedback;
	@Column(name = "productrating")
	@Size(max = 1)
	@Max(5)
	@Min(1)
	private int rating;
	@OneToOne
	@NotNull
	@JoinColumn(name = "customerid")
	private Customer customer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getProductFeedback() {
		return productFeedback;
	}

	public void setProductFeedback(String productFeedback) {
		this.productFeedback = productFeedback;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
