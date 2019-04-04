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
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Cart")
@SequenceGenerator(name = "cartseq", initialValue = 20000, allocationSize = 1000)
public class Cart {
	
	@Id
	@Column(name = "cartid")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cartseq")
	private int id;
	@OneToOne
	@NotNull
	@JoinColumn(name = "customerid")
	private Customer customer;
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@NotNull
	@JoinColumn(name = "productid")
	private Product product;
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@NotNull
	@JoinColumn(name = "merchantid")
	private Merchant merchant;
	@Column(name = "productquantity")
	@NotNull
	private int quantity;
	@Column(name = "productprice")
	@NotNull
	private double productPrice;
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@NotNull
	@JoinColumn(name = "promocode")
	private Promo promo;
	@Column(name = "softdelete")
	@NotNull
	@Size(max = 1)
	@Pattern(regexp = "\\b(A|I)\\b")
	private String softDelete;

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

	public Merchant getMerchant() {
		return merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public Promo getPromo() {
		return promo;
	}

	public void setPromo(Promo promo) {
		this.promo = promo;
	}

	public String getSoftDelete() {
		return softDelete;
	}

	public void setSoftDelete(String softDelete) {
		this.softDelete = softDelete;
	}

}
