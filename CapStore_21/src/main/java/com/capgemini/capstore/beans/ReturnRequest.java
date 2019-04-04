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
@Table(name = "Returnrequest")
@SequenceGenerator(name = "retseq", initialValue = 4000, allocationSize = 1000)
public class ReturnRequest {

	@Id
	@Column(name = "retid")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "retseq")
	private int id;
	@OneToOne(cascade = CascadeType.ALL)
	@NotNull
	@JoinColumn(name = "customerid")
	private Customer customer;
	@OneToOne(cascade = CascadeType.ALL)
	@NotNull
	@JoinColumn(name = "merchantid")
	private Merchant merchant;
	@OneToOne(cascade = CascadeType.ALL)
	@NotNull
	@JoinColumn(name = "productid")
	private Product product;
	@OneToOne(cascade = CascadeType.ALL)
	@NotNull
	@JoinColumn(name = "orderid")
	private Order order;
	@Column(name = "refundamount")
	@NotNull
	private double refundAmount;
	@Column(name = "returnstatus")
	@NotNull
	@Size(max = 10)
	@Pattern(regexp = "\\b(APPLIED|APPROVED|REJECTED)\\b")
	private String returnStatus;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
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

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public double getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(double refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getReturnStatus() {
		return returnStatus;
	}

	public void setReturnStatus(String returnStatus) {
		this.returnStatus = returnStatus;
	}

}
