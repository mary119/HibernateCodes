package com.xworkz.mary.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.GenericGenerators;


@Entity
@Table(name="internet_table")
public class InternetProviderDTO implements Serializable {
	
	public InternetProviderDTO() {
		System.out.println(this.getClass().getSimpleName() +"created");
	}
	
	@Id
	@GenericGenerator(name="ref" , strategy = "increment")
	@GeneratedValue(generator = "ref")
	@Column(name="internet_id")
	private int internetId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="signal_strength")
	private String signalStrength;
	
	@Column(name="plan")
	private String plan;
	
	@Column(name="price")
	private String price;

	public int getInternetId() {
		return internetId;
	}

	public void setInternetId(int internetId) {
		this.internetId = internetId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSignalStrength() {
		return signalStrength;
	}

	public void setSignalStrength(String signalStrength) {
		this.signalStrength = signalStrength;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "InternetProviderDTO [internetId=" + internetId + ", name=" + name + ", signalStrength=" + signalStrength
				+ ", plan=" + plan + ", price=" + price + "]";
	}

	



}
