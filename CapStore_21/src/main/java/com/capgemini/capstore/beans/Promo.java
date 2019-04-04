package com.capgemini.capstore.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Promo")
public class Promo {
	@Id
	@Column(name = "promocode")
	@NotNull
	@Size(max=15)
	private String promoCode;
	@Column(name = "discountoffered")
	@NotNull
	@Size(max =2)
	private double discountOffered;
	@Column(name = "promovalidity")
	@NotNull
	private Date promoValidity;
	@Column(name = "softdelete")
	@NotNull
	@Size(max = 1)
	@Pattern(regexp = "\\b(A|I)\\b")
	private String softDelete;

	public String getPromoCode() {
		return promoCode;
	}

	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}

	public double getDiscountOffered() {
		return discountOffered;
	}

	public void setDiscountOffered(double discountOffered) {
		this.discountOffered = discountOffered;
	}

	public Date getPromoValidity() {
		return promoValidity;
	}

	public void setPromoValidity(Date promoValidity) {
		this.promoValidity = promoValidity;
	}

	public String getSoftDelete() {
		return softDelete;
	}

	public void setSoftDelete(String softDelete) {
		this.softDelete = softDelete;
	}

}
