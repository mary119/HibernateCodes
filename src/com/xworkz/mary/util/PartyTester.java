package com.xworkz.mary.util;

import com.xworkz.mary.dao.PoliticalPartyDAO;
import com.xworkz.mary.dao.PoliticalPartyDAOImpl;
import com.xworkz.mary.dto.PoliticalPartyDTO;

public class PartyTester {

	public static void main(String[] args) {
 

		PoliticalPartyDTO dto = new PoliticalPartyDTO();
		//dto.setPartyId(1);
		dto.setPartyName("BJP");
		dto.setPartySymbol("Lotus");
		dto.setTypeOfparties("central");
		
		PoliticalPartyDAO dao = new PoliticalPartyDAOImpl();
		//dao.savePoliticalParty(dto);
		dao.fetchData(2);
	}

}
