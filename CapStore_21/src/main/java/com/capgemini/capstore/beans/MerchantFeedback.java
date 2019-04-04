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
@Table(name = "Merchantfeedback")
@SequenceGenerator(name = "mercfseq", initialValue = 1000, allocationSize = 100)
public class MerchantFeedback {

	@Id
	@Column(name = "mrid")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mercfseq")
	private int id;
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@NotNull
	@JoinColumn(name = "merchantid")
	private Merchant merchant;
	@Size(max = 100)
	@Column(name = "merchantfeedback")
	private String merchantFeedback;
	
	@Column(name="status")
	@Pattern(regexp = "\\b(R|C|V)\\b")
	@Size(max = 10)
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

	public Merchant getMerchant() {
		return merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}

	public String getMerchantFeedback() {
		return merchantFeedback;
	}

	public void setMerchantFeedback(String merchantFeedback) {
		this.merchantFeedback = merchantFeedback;
	}


}
