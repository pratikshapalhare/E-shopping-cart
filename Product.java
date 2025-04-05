package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name="product")
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long product_id;
	private String name;
	
/*
Eager Fetching (FetchType.EAGER):
Description: Data is loaded immediately along with the parent entity.
Use Case: Useful when you always need the related data along with the parent entity.

Lazy Fetching (FetchType.LAZY):
Description: Data is loaded on-demand, i.e., when it is accessed for the first time.
Use Case: Useful when you don’t always need the related data, which can help improve performance.
*/
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id",referencedColumnName="id")
	private Category category;

	private double price;
	private double weight;
	private String imgName;
	
	
	public String getImgName() {
		return imgName;
	}
	public void setImgName(String imgName) {
		this.imgName = imgName;
	}
	public Long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

}
