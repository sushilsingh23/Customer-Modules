package com.capgemini.capstore.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "User")
public class User {

	@Id
	@Column(name = "emailid")
	@NotNull
	@Email
	@Size(max = 50)
	private String emailId;
	@Column(name = "password")
	@NotNull	
	@Size(max = 100)
	private String password;
	@Column(name = "role")
	@NotNull
	@Pattern(regexp="\\b(ADMIN|MERCHANT|CUSTOMER)\\b")
	@Size(max = 20)
	private String role;
	@Column(name = "securityquestion")
	@Size(max = 100)
	@NotNull
	private String securityQuestion;
	@Column(name = "securityanswer")
	@Size(max = 100)
	@NotNull
	private String securityAnswer;

	
	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public String getSecurityAnswer() {
		return securityAnswer;
	}

	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
