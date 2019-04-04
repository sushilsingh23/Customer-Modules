package com.capgemini.capstore.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Email")
@SequenceGenerator(name = "emseq", initialValue = 8000, allocationSize = 1000)
public class Email {

	@Id
	@Column(name= "eid")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emseq")
	private int id;
	@Column(name = "sender")
	@NotNull
	@Size(max =20)
	private String senderEmail;
	@Column(name = "receiver")
	@NotNull
	@Size(max =20)
	private String receiverEmail;
	@Column(name = "subject")
	@Size(max = 50)
	private String subject;
	@Column(name = "bodymessage")
	@Size(max = 500)
	private String bodyMessage;
	@Column(name = "status")
	@Size(max =1)
	@NotNull
	@Pattern(regexp = "\\b(Y|N)\\b")
	private String status;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSenderEmail() {
		return senderEmail;
	}

	public void setSenderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
	}

	public String getReceiverEmail() {
		return receiverEmail;
	}

	public void setReceiverEmail(String receiverEmail) {
		this.receiverEmail = receiverEmail;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBodyMessage() {
		return bodyMessage;
	}

	public void setBodyMessage(String bodyMessage) {
		this.bodyMessage = bodyMessage;
	}

}
