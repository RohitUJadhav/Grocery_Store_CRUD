package com.gigabyte.grocery.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class grocery {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Integer product_id;
	private String product_name;
	private Integer price;
	private Integer quantity;
	
	@DateTimeFormat
	private Date manufacture_date;
	@DateTimeFormat
	private Date expire_date;
	public Integer getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Date getManufacture_date() {
		return manufacture_date;
	}
	public void setManufacture_date(Date manufacture_date) {
		this.manufacture_date = manufacture_date;
	}
	public Date getExpire_date() {
		return expire_date;
	}
	public void setExpire_date(Date expire_date) {
		this.expire_date = expire_date;
	}
	@Override
	public String toString() {
		return "grocery [product_id=" + product_id + ", product_name=" + product_name + ", price=" + price
				+ ", quantity=" + quantity + ", manufacture_date=" + manufacture_date + ", expire_date=" + expire_date
				+ "]";
	}
	
	
	

}
