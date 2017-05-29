package com.eshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class AdministrationDetails {
	@Id
	@GeneratedValue
	@Column(name="PRODUCT")
	private String product;
	
	@Column(name="SUPPLIER")
	private String supplier;
	
	@Column(name="CATEGORIES")
	private String categories;

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getCategories() {
		return categories;
	}

	public void setCatagories(String categories) {
		this.categories = categories;
	}
}
