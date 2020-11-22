package com.xworkz.mary.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.mary.dto.FlowersDTO;

public class FlowersDAOImpl implements FlowersDAO{

	@Override
	public void saveFlowersDAO(FlowersDTO flowersdto) {
		// TODO Auto-generated method stub
		Configuration con = new Configuration();
		con.configure();
		con.addAnnotatedClass(FlowersDTO.class);
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
    	Transaction tx = session.beginTransaction();

		session.save(flowersdto);
		session.getTransaction().commit();
		session.close();
		factory.close();
		
		
		
	}

}
