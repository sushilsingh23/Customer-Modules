package com.capgemini.capstore.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Productdetail")
@SequenceGenerator(name = "prodseq", initialValue = 30000, allocationSize = 1000)
public class Product {

	@Id
	@Column(name = "productid")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prodseq")
	private int productId;
	@Size(max = 20)
	@Column(name = "productname")
	@NotNull
	private String productName;
	@Size(max=100)
	@Column(name = "productimageurl")
	@NotNull
	private String productImageUrl;
	@Column(name = "productcategory")
	@Size(max = 15)
	@NotNull
	private String productCategory;
	@Size(max = 15)
	@Column(name = "productbrand")
	@NotNull
	private String productBrand;
	@Column(name = "productmodel")
	@Size(max = 15)
	@NotNull
	private String productModel;
	@Size(max = 15)
	@Column(name = "producttype")
	@NotNull
	private String productType;
	@Size(max = 100)
	@Column(name = "productfeatures")
	@NotNull
	private String productFeature;
	@Column(name = "productprice")
	@NotNull
	private double productPrice;

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductImageUrl() {
		return productImageUrl;
	}

	public void setProductImageUrl(String productImageUrl) {
		this.productImageUrl = productImageUrl;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public String getProductModel() {
		return productModel;
	}

	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductFeature() {
		return productFeature;
	}

	public void setProductFeature(String productFeature) {
		this.productFeature = productFeature;
	}

}
