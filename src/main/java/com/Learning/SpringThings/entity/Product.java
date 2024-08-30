package com.Learning.SpringThings.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Product {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private int productId;
@Column(name = "product_price")
private int productprice;
@Column(name = "product_name")
private String Productname;
@Column(name ="product_brand")
private String productbrand;


public Product() {
	
}


public Product(int productprice, String productname, String productbrand) {

	this.productprice = productprice;
	Productname = productname;
	this.productbrand = productbrand;
}


public int getProductId() {
	return productId;
}


public void setProductId(int productId) {
	this.productId = productId;
}


public int getProductprice() {
	return productprice;
}


public void setProductprice(int productprice) {
	this.productprice = productprice;
}


public String getProductname() {
	return Productname;
}


public void setProductname(String productname) {
	Productname = productname;
}


public String getProductbrand() {
	return productbrand;
}


public void setProductbrand(String productbrand) {
	this.productbrand = productbrand;
}





	
}
