package com.xworkz.mary.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="party_table")
public class PoliticalPartyDTO implements Serializable {
	
	public PoliticalPartyDTO() {
		System.out.println(this.getClass().getSimpleName() + "created");
	}
	
	@Id
	@GenericGenerator(name="ref" , strategy = "increment")
	@GeneratedValue(generator = "ref")
	@Column(name="political_party_id")
	private int politicalPartyId;
	
	@Column(name="party_name")
	private String partyName;
	
	@Column(name="party_symbol")
	private String partySymbol;
	
	@Column(name="type_of_parties")
	private String typeOfparties;
	
	public int getpoliticalPartyId() {
		return politicalPartyId;
	}
	public void setPartyId(int partyId) {
		this.politicalPartyId = partyId;
	}
	public String getPartyName() {
		return partyName;
	}
	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}
	public String getPartySymbol() {
		return partySymbol;
	}
	public void setPartySymbol(String partySymbol) {
		this.partySymbol = partySymbol;
	}
	public String getTypeOfparties() {
		return typeOfparties;
	}
	public void setTypeOfparties(String typeOfparties) {
		this.typeOfparties = typeOfparties;
	}
	@Override
	public String toString() {
		return "PoliticalPartyDTO [partyId=" + politicalPartyId + ", partyName=" + partyName + ", partySymbol=" + partySymbol
				+ ", typeOfparties=" + typeOfparties + "]";
	}
	
	

}
