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
@Table(name = "Offer")
@SequenceGenerator(name = "offerseq", initialValue = 10, allocationSize = 100)
public class Offer {

	@Id
	@Column(name = "offerid")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "offerseq")
	private int offerId;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "merchantid")
	@NotNull
	private Merchant merchant;
	@JoinColumn(name = "productid")
	@NotNull
	@OneToOne(cascade = CascadeType.ALL)
	private Product product;
	@Column(name = "offerdescription")
	@Size(max =100)
	private String offerDescription;
	@Column(name = "offerstartdate")
	@NotNull
	private Date offerStartDate;
	@Column(name = "offerenddate")
	@NotNull
	private Date offerEndDate;
	@Column(name = "discountoffered")
	@NotNull
	private double discountOffered;
	@Column(name = "softdelete")
	@NotNull
	@Size(max = 1)
	@Pattern(regexp = "\\b(A|I)\\b")
	private String softDelete;

	public int getOfferId() {
		return offerId;
	}

	public void setOfferId(int offerId) {
		this.offerId = offerId;
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

	public String getOfferDescription() {
		return offerDescription;
	}

	public void setOfferDescription(String offerDescription) {
		this.offerDescription = offerDescription;
	}

	public Date getOfferStartDate() {
		return offerStartDate;
	}

	public void setOfferStartDate(Date offerStartDate) {
		this.offerStartDate = offerStartDate;
	}

	public Date getOfferEndDate() {
		return offerEndDate;
	}

	public void setOfferEndDate(Date offerEndDate) {
		this.offerEndDate = offerEndDate;
	}

	public double getDiscountOffered() {
		return discountOffered;
	}

	public void setDiscountOffered(double discountOffered) {
		this.discountOffered = discountOffered;
	}

	public String getSoftDelete() {
		return softDelete;
	}

	public void setSoftDelete(String softDelete) {
		this.softDelete = softDelete;
	}

}
