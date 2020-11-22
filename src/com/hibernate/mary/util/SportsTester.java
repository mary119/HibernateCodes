package com.hibernate.mary.util;

import com.hibernate.mary.dao.SportsDAO;
import com.hibernate.mary.dao.SportsDAOImpl;
import com.hibernate.mary.dto.SportsDTO;

public class SportsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SportsDTO dto = new SportsDTO();
		dto.setName("Hockey");
		dto.setNoOfplayers("11");
		dto.setType("OutDoor");
		
		SportsDAO dao = new SportsDAOImpl();
		dao.fetchData(2);
		//dao.saveSportsDtls(dto);

	}

}
