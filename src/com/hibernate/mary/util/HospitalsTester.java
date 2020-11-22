package com.hibernate.mary.util;

import com.hibernate.mary.dao.HospitalsDAO;
import com.hibernate.mary.dao.HospitalsDAOImpl;
import com.hibernate.mary.dto.HospitalsDTO;

public class HospitalsTester {

	public static void main(String[] args) {

		 HospitalsDTO dto = new  HospitalsDTO();
		 dto.setName("Sahana Hospital");
		 dto.setPlace("manvi");
		 dto.setPhoneNo(12345678);
		 
		 HospitalsDAO dao = new HospitalsDAOImpl();
		 dao.saveHospitalsDtls(dto);
		 
		 
	}

}
