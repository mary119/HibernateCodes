package com.hibernate.mary.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name= "hospital_table")
public class HospitalsDTO implements Serializable {
	 
	public HospitalsDTO() {
	
	}

	@Id
	@GenericGenerator(name= "ref", strategy = "increment" )
	@GeneratedValue(generator = "ref")
	
	@Column(name="hospital_id")
	private int hospitalId;
	@Column(name= "name")
	private String name;
	
	@Column(name="place")
	private String place;
	@Column(name="phone_no")
	private int phoneNo;
	
	public int getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "HospitalsDTO [hospitalId=" + hospitalId + ", name=" + name + ", place=" + place + ", phoneNo=" + phoneNo
				+ "]";
	}
	
}
