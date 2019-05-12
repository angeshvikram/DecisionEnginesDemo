package com.angeshde.springboot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {

	@Id
	private String id;
	private Integer prod_price;
	private String prod_name;
	private String prod_desc;

	public Product() {
	};

	public Product(String id, Integer prod_price, String prod_name, String prod_desc) {
		super();
		this.id = id;
		this.prod_price = prod_price;
		this.prod_name = prod_name;
		this.prod_desc = prod_desc;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getProd_price() {
		return prod_price;
	}

	public void setProd_price(Integer prod_price) {
		this.prod_price = prod_price;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public String getProd_desc() {
		return prod_desc;
	}

	public void setProd_desc(String prod_desc) {
		this.prod_desc = prod_desc;
	}

}
