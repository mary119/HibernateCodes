package com.xworkz.mary.test;

import com.xworkz.mary.dao.lplPointsDAO;
import com.xworkz.mary.dto.IplPointsDTO;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IplPointsDTO dto  = new IplPointsDTO();
		dto.setIplId(2);
		dto.setIplTeamNames("Kings X11 punjab");
		dto.setCity("punjab");
		dto.setPoints(6);
		dto.setNoOfMatches(9);
		
		
		lplPointsDAO dao   =   new lplPointsDAO();
		dao.saveIplPoints(dto); 		
	}

}
