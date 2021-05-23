package com.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idCateg;
	private String libelCateg;
	
	
	public Category() {}


	public Category(String libelCateg) {
		super();
		this.libelCateg = libelCateg;
	}


	public Integer getIdCateg() {
		return idCateg;
	}


	public void setIdCateg(Integer idCateg) {
		this.idCateg = idCateg;
	}


	public String getLibelCateg() {
		return libelCateg;
	}


	public void setLibelCateg(String libelCateg) {
		this.libelCateg = libelCateg;
	}


	@Override
	public String toString() {
		return "Category [idCateg=" + idCateg + ", libelCateg=" + libelCateg + "]";
	}
	
}
