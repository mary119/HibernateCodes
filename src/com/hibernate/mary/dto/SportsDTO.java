package com.hibernate.mary.dto;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
@Table(name = "sport_table")
public class SportsDTO implements Serializable{
	
	public SportsDTO() {
		System.out.println(this.getClass().getSimpleName() + "created");
	
	}
    @Id
    @GenericGenerator(name="ref" , strategy = "increment")
	@GeneratedValue(generator = "ref")
    @Column(name= "sports_id")
	private int sportsId;
    @Column(name= "sport_name")
	private String name;
    @Column(name="no_of_players")
    private String noOfplayers;
    @Column(name= "sport_type")
	private String type;
	public int getSportsId() {
		return sportsId;
	}
	public void setSportsId(int sportsId) {
		this.sportsId = sportsId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNoOfplayers() {
		return noOfplayers;
	}
	public void setNoOfplayers(String noOfplayers) {
		this.noOfplayers = noOfplayers;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "SportsDTO [sportsId=" + sportsId + ", name=" + name + ", noOfplayers=" + noOfplayers + ", type=" + type
				+ "]";
	}
	
}
