package com.xworkz.mary.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.mary.dto.IplPointsDTO;

public class lplPointsDAO {

	public lplPointsDAO() {
		System.out.println(this.getClass().getSimpleName() + "created");
	}
	
	public void saveIplPoints(IplPointsDTO dto) {
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(IplPointsDTO.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(dto);
		transaction.commit();
		session.close();
		factory.close();

	}


}
