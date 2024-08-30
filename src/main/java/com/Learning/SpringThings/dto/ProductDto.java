package com.Learning.SpringThings.dto;

public class ProductDto {
	private int productId;

	private int productprice;

	private String Productname;

	private String productbrand;

	public ProductDto(int productprice, String productname, String productbrand) {
		

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
