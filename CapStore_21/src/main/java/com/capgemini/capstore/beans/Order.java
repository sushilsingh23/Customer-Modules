package com.capgemini.capstore.beans;

import java.util.Date;

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
@Table(name = "Orderdetail")
@SequenceGenerator(name = "ordseq", initialValue = 500, allocationSize = 1000)

public class Order {

	@Id
	@Column(name = "orid")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ordseq")
	private int id;
	@NotNull
	@OneToOne
	@JoinColumn(name = "orderid")
	private DummyOrder order;
	@Column(name = "orderdate")
	@NotNull
	private Date orderDate;
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@NotNull
	@JoinColumn(name = "customerid")
	private Customer customer;
	@OneToOne
	@NotNull
	@JoinColumn(name = "merchantid")
	private Merchant merchant;
	@JoinColumn(name = "productid")
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@NotNull
	private Product product;
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@NotNull
	@JoinColumn(name = "promocode")
	private Promo promo;
	@Column(name = "deliverystatus")
	@NotNull
	@Size(max = 10)
	@Pattern(regexp = "\\b(ORDERED|SHIPPED|OUTFORDELIVERY|DELIVERED)\\b")
	private String deliveryStatus;
	@Column(name = "productquantity")
	@NotNull
	private int productQuantity;
	@Column(name = "totalprice")
	@NotNull
	private double totalProductPrice;
	@Column(name = "finalprice")
	@NotNull
	private double finalProductPrice;
	
	

	public Promo getPromo() {
		return promo;
	}

	public void setPromo(Promo promo) {
		this.promo = promo;
	}

	public DummyOrder getOrder() {
		return order;
	}

	public void setOrder(DummyOrder order) {
		this.order = order;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Merchant getMerchant() {
		return merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public double getTotalProductPrice() {
		return totalProductPrice;
	}

	public void setTotalProductPrice(double totalProductPrice) {
		this.totalProductPrice = totalProductPrice;
	}

	public double getFinalProductPrice() {
		return finalProductPrice;
	}

	public void setFinalProductPrice(double finalProductPrice) {
		this.finalProductPrice = finalProductPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

}
