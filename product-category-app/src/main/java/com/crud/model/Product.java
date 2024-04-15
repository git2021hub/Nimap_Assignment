package com.crud.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="PRODUCT")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long pid;
	
	@Column(name="Product_name")
	private String name;
	
	@Column(name = "Product_price")
	private int price;
	
	@ManyToOne
	@JoinColumn(name = "categoryid")
	private Category cid;

	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(long pid, String name, int price) {
		
		this.pid = pid;
		this.name = name;
		this.price = price;
	}

	public long getId() {
		return pid;
	}

	public void setId(long pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public Category getCid() {
		return cid;
	}

	public void setCid(Category cid) {
		this.cid = cid;
	}

	
}
