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
@Table(name = "Admindetail", uniqueConstraints = { @UniqueConstraint(columnNames = { "email", "mobileNo" }) })
@SequenceGenerator(name = "admseq", initialValue = 100, allocationSize = 1)
public class Admin {

	@Id
	@Column(name = "adminid")
	@NotNull
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "admseq")
	private int adminId;
	@Size(max = 20)
	@Column(name = "adminname")
	@NotNull
	private String adminName;
	@Column(name = "email")
	@NotNull
	@Email
	@Size(max = 30)
	private String adminEmail;
	@Column(name = "mobileno")
	@NotNull
	@Size(max = 10)
	private String adminMobileNumber;

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getAdminMobileNumber() {
		return adminMobileNumber;
	}

	public void setAdminMobileNumber(String adminMobileNumber) {
		this.adminMobileNumber = adminMobileNumber;
	}

}
