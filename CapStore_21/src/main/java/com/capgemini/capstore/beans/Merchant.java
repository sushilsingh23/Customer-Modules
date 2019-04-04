package com.capgemini.capstore.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Merchantdetail", uniqueConstraints = { @UniqueConstraint(columnNames = { "email", "mobileNo" }) })
@SequenceGenerator(name = "mercseq", initialValue = 2000, allocationSize = 100)
public class Merchant {

	@Id
	@Column(name = "merchantid")
	@NotNull
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mercseq")
	private int merchantId;
	@Column(name = "merchantname")
	@NotNull
	@Size(max = 20)
	private String merchantName;
	@Column(name = "email")
	@NotNull
	@Email
	@Size(max = 30)
	private String merchantEmail;
	@Column(name = "mobileno")
	@NotNull
	@Size(max = 10)
	private String merchantMobileNumber;
	@Column(name = "address")
	@Size(max = 100)
	@NotNull
	private String merchantAddress;
	@Column(name = "storename")
	@Size(max = 20)
	private String merchantStoreName;
	@Column(name = "merchantrating")
	@Size(max = 1)
	@Max(5)
	@Min(1)
	private int merchantRating;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Product> products;
	
	
	
	public int getMerchantRating() {
		return merchantRating;
	}

	public void setMerchantRating(int merchantRating) {
		this.merchantRating = merchantRating;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public int getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantEmail() {
		return merchantEmail;
	}

	public void setMerchantEmail(String merchantEmail) {
		this.merchantEmail = merchantEmail;
	}

	public String getMerchantMobileNumber() {
		return merchantMobileNumber;
	}

	public void setMerchantMobileNumber(String merchantMobileNumber) {
		this.merchantMobileNumber = merchantMobileNumber;
	}

	public String getMerchantAddress() {
		return merchantAddress;
	}

	public void setMerchantAddress(String merchantAddress) {
		this.merchantAddress = merchantAddress;
	}

	public String getMerchantStoreName() {
		return merchantStoreName;
	}

	public void setMerchantStoreName(String merchantStoreName) {
		this.merchantStoreName = merchantStoreName;
	}

}
