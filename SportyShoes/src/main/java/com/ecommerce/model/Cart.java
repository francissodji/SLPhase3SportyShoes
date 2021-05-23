package com.ecommerce.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "cart")
public class Cart implements Serializable {

	private static final long serialVersionUID = 8436097833452420298L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String cartId;

	@OneToOne
	@JoinColumn(name = "customerId")
	@JsonIgnore
	private Users users;

	@OneToMany(mappedBy = "cart", cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	private List<CartItem> cartItem;

	private double totalPrice;

	
	public Cart(Users users, List<CartItem> cartItem, double totalPrice) {
		super();
		this.users = users;
		this.cartItem = cartItem;
		this.totalPrice = totalPrice;
	}

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}


	public List<CartItem> getCartItem() {
		return cartItem;
	}

	public void setCartItem(List<CartItem> cartItem) {
		this.cartItem = cartItem;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

}
