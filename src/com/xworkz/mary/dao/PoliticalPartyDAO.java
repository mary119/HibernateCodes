package com.xworkz.mary.dao;

import com.xworkz.mary.dto.PoliticalPartyDTO;

public interface PoliticalPartyDAO {
	
	public void savePoliticalParty(PoliticalPartyDTO partyDTO);
	PoliticalPartyDTO fetchData(int id);

}
