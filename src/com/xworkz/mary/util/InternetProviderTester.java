package com.xworkz.mary.util;

import java.util.Scanner;

import com.xworkz.mary.dao.InternetProviderDAO;
import com.xworkz.mary.dao.InternetProviderDAOImpl;
import com.xworkz.mary.dto.InternetProviderDTO;


public class InternetProviderTester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Speed");
		int speed=sc.nextInt();

		InternetProviderDTO dto = new InternetProviderDTO();
		dto.setInternetId(1);
		dto.setName("Airtel");
		if(speed > 7){
		dto.setSignalStrength("High");
		}
		else {
			dto.setSignalStrength("Low");
		}
		dto.setPlan("400GB");
		dto.setPrice("1100");
		
		InternetProviderDAO dao = (InternetProviderDAO) new InternetProviderDAOImpl();
		dao.save(dto);
        dao.fetchInternet(2);
       // dao.updateInternetProvider("Docomo", 2);
        dao.deleteInternetProvider("docomo", 2);
		
	}

}
