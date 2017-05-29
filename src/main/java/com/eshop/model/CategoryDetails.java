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
public class CategoryDetails {
	@Id
	@GeneratedValue
	@Column(name="CATEGORIESID")
	private int categoriesId;
	
	@Column(name="CATEGORIESNAME")
	private String categoriesName;
	
	@Column(name="CATEGORIESDESCRIPTION")
	private String categoriesDescription;

	public int getCategoriesId() {
		return categoriesId;
	}

	public void setCategoriesId(int categoriesId) {
		this.categoriesId = categoriesId;
	}

	public String getCategoriesName() {
		return categoriesName;
	}

	public void setCategoriesName(String categoriesName) {
		this.categoriesName = categoriesName;
	}

	public String getCategoriesDescription() {
		return categoriesDescription;
	}

	public void setCategoriesDescription(String categoriesDescription) {
		this.categoriesDescription = categoriesDescription;
	}
}
