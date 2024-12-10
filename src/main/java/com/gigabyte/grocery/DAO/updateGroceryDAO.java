package com.gigabyte.grocery.DAO;

import java.util.Date;

public class updateGroceryDAO {
	
	private String product_name;
	private Integer price;
	private Integer quantity;
	private Date manufacture_date;
	private Date expire_date;
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
		return "updateGroceryDAO [product_name=" + product_name + ", price=" + price + ", quantity=" + quantity
				+ ", manufacture_date=" + manufacture_date + ", expire_date=" + expire_date + "]";
	}
	
	

}
