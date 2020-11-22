package com.xworkz.mary.test;

import com.xworkz.mary.dao.FlowersDAO;
import com.xworkz.mary.dao.FlowersDAOImpl;
import com.xworkz.mary.dto.FlowersDTO;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlowersDTO dto = new FlowersDTO();
		dto.setflowerId(1);
		dto.setName("Jasmine");
		dto.setColor("White");
		dto.setPrice(30);

		FlowersDAO dao = new FlowersDAOImpl();
		dao.saveFlowersDAO(dto);
		
	}

}
