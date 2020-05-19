package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Store {
	
	@Id
	private Integer itemId;
	private String itemName;
	private String itemCatagory;
	private Integer itemPrice;
	
	public Store()
	{
		
	}

	public Store(Integer itemId, String itemName, String itemCatagory, Integer itemPrice) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemCatagory = itemCatagory;
		this.itemPrice = itemPrice;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemCatagory() {
		return itemCatagory;
	}

	public void setItemCatagory(String itemCatagory) {
		this.itemCatagory = itemCatagory;
	}

	public Integer getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Integer itemPrice) {
		this.itemPrice = itemPrice;
	}

	@Override
	public String toString() {
		return "Store [itemId=" + itemId + ", itemName=" + itemName + ", itemCatagory=" + itemCatagory + ", itemPrice="
				+ itemPrice + "]";
	}
	
	
	
	
	
}
