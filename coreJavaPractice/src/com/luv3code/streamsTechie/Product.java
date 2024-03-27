package com.luv3code.streamsTechie;

public class Product {
	private String brand;
	private int ser;
	private Float price;

	public Product( int ser, String brand, Float price) {
		super();
		this.brand = brand;
		this.ser = ser;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSer() {
		return ser;
	}

	public void setSer(int ser) {
		this.ser = ser;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [brand=" + brand + ", ser=" + ser + ", price=" + price + "]";
	}

	
}
