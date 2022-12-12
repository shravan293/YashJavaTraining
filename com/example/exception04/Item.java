package com.example.exception04;

public class Item {

	private String name;
	private long price;
	private int maxNoItem;
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(String name, long price, int maxNoItem) {
		super();
		this.name = name;
		this.price = price;
		this.maxNoItem = maxNoItem;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public int getMaxNoItem() {
		return maxNoItem;
	}
	public void setMaxNoItem(int maxNoItem) {
		this.maxNoItem = maxNoItem;
	}
	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + ", maxNoItem=" + maxNoItem + "]";
	}
}
