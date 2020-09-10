package com.myretail.price;

public class PriceDTO {
	private String productID;
	private double value;
	private String currencyCode;

	public double getValue() {
		return value;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

}
