package com.example.oops.q10;

public class Product implements Cloneable {

	int pId;
	String pName;
	double price;
	String unitOfMeasurement;

	public Product(int pId, String pName, double price, String unitOfMeasurement) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.unitOfMeasurement = unitOfMeasurement;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", price=" + price + ", unitOfMeasurement="
				+ unitOfMeasurement + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
