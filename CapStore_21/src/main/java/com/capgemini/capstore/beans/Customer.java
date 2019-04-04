package com.capgemini.capstore.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Customerdetail", uniqueConstraints = { @UniqueConstraint(columnNames = { "email", "mobileNo" }) })
@SequenceGenerator(name = "custseq", initialValue = 10000, allocationSize = 1000)
public class Customer {

	@Id
	@Column(name = "customerid")
	@NotNull
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custseq")
	private int customerId;
	@Column(name = "customername")
	@NotNull
	@Size(max = 20)
	private String customerName;
	@Column(name = "email")
	@NotNull
	@Email
	@Size(max = 30)
	private String customerEmail;
	@Column(name = "mobileno")
	@NotNull
	@Size(max = 10)
	private String customerMobileNumber;
	@Column(name = "address")
	@NotNull
	@Size(max = 100)
	private String customerAddress;
	@Column(name = "pincode")
	@Size(max = 6)
	@NotNull
	private String customerPincode;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerMobileNumber() {
		return customerMobileNumber;
	}

	public void setCustomerMobileNumber(String customerMobileNumber) {
		this.customerMobileNumber = customerMobileNumber;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerPincode() {
		return customerPincode;
	}

	public void setCustomerPincode(String customerPincode) {
		this.customerPincode = customerPincode;
	}

}
