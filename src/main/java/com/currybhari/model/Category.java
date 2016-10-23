package com.currybhari.model;

public class Category {
	private long categoryId;
	private String name;
	
	public Category(long categoryId, String name) {
		super();
		this.categoryId = categoryId;
		this.name = name;
	}
	
	public long getCategoryId() {
		return categoryId;
	}
	
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
