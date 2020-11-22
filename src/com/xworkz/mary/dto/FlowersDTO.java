package com.xworkz.mary.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flower_table")
public class FlowersDTO implements Serializable{

	public FlowersDTO() {
		System.out.println(this.getClass().getSimpleName() + "DTO created");
	}
 
	@Id
	@Column(name="flower_id")
	private int flowerId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="color")
	private String color;
	
	@Column(name="price")
	private int price;
	
	public int getflowerId() {
		return flowerId;
	}
	public void setflowerId(int id) {
		flowerId = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
