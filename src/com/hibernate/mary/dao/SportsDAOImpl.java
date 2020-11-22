package com.hibernate.mary.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.hibernate.mary.dto.SportsDTO;

public class SportsDAOImpl implements SportsDAO {
	
	public SportsDAOImpl() {
		
	}
	
	
	private StandardServiceRegistry standardServiceRegistry;
	 Session session =null;
	 Transaction tx = null;

	@Override
	public void saveSportsDtls(SportsDTO sportsdto) {
		// TODO Auto-generated method stub
		
	
       try {
		standardServiceRegistry = new StandardServiceRegistryBuilder().configure().build();
		MetadataSources metadataSources = new MetadataSources(standardServiceRegistry);
		Metadata metadata = metadataSources.getMetadataBuilder().build();
		SessionFactory factory= metadata.getSessionFactoryBuilder().build();
		session = factory.openSession();
		 tx = session.beginTransaction();
		session.save(sportsdto);
		//SportsDTO sportsDTO = session.get(SportsDTO.class,SportsId);
		//System.out.println(sportsDTO);
  		 session.getTransaction().commit();

  		 
  		 

		session.close();
		factory.close();
		
        } catch (HibernateException e) {

			// TODO: handle exception
        	e.printStackTrace();

        	}
        }
	@Override
	
	public SportsDTO fetchData(int id) {

		standardServiceRegistry = new StandardServiceRegistryBuilder().configure().build();
		MetadataSources metadataSources = new MetadataSources(standardServiceRegistry);
		Metadata metadata = metadataSources.getMetadataBuilder().build();
		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
		Session session1 = sessionFactory.openSession();
		//SportsDTO sportsDTO = session.load(SportsDTO.class, id);
		//System.out.println(sportsDTO);
		SportsDTO sportsDTO = session1.get(SportsDTO.class, id);
		System.out.println(sportsDTO);
		session1.close();
		
		Session session2 = sessionFactory.openSession();
        sportsDTO = session2.get(SportsDTO.class, id);
		System.out.println(sportsDTO);
		session2.close();
		sessionFactory.close();
		return sportsDTO;
		
		
	}
	
	}


