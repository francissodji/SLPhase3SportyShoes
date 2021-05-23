package com.ecommerce.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.ForeignKey;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idProduct;
	private String designProduct;
	private int unitPrice;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idCategory", foreignKey=@ForeignKey(name="idCategory_foreign"))
	private Category category;
	
	@Column(nullable = true, length = 64)
	private String picture;
	
	public Product() {}
	
	

	public Product(String designProduct, int unitPrice, Category category, String picture) {
		super();
		this.designProduct = designProduct;
		this.unitPrice = unitPrice;
		this.category = category;
		this.picture = picture;
	}


	
	
	public Category getCategory() {
		return category;
	}



	public void setCategory(Category category) {
		this.category = category;
	}



	public String getPicture() {
		return picture;
	}



	public void setPicture(String picture) {
		this.picture = picture;
	}



	public Integer getIdProduct() {
		return idProduct;
	}


	public void setIdProduct(Integer idProduct) {
		this.idProduct = idProduct;
	}


	public String getDesignProduct() {
		return designProduct;
	}


	public void setDesignProduct(String designProduct) {
		this.designProduct = designProduct;
	}


	public int getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}


	@Override
	public String toString() {
		return "Product [idProduct=" + idProduct + ", designProduct=" + designProduct + ", unitPrice=" + unitPrice
				+ "]";
	}
	
	
	
}
