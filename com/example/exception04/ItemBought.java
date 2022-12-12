package com.example.exception04;

public class ItemBought {

	private int itemId;
	private String itemQty;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemQty() {
		return itemQty;
	}

	public void setItemQty(String itemQty) {
		this.itemQty = itemQty;
	}

	@Override
	public String toString() {
		return "ItemBought [itemId=" + itemId + ", itemQty=" + itemQty + "]";
	}

}
