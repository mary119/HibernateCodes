package com.xworkz.mary.dao;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jdbc.singleton.HibernateSingleton;
import com.xworkz.mary.dto.InternetProviderDTO;

public class InternetProviderDAOImpl implements InternetProviderDAO{
	
	public InternetProviderDAOImpl() {

	}
	//using singlton i.e reducing code using singleton
	@Override
	public void save(InternetProviderDTO dto) {
		Session session = null;
		try {
			session= HibernateSingleton.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(dto);
			session.getTransaction().commit();
			session.close();
		}catch (HibernateException e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		}
	}
		/*Configuration cfg = new Configuration();
		cfg.configure("mary.xml");
		
        cfg.addAnnotatedClass(InternetProviderDTO.class);
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(dto);
        session.getTransaction().commit();
        session.close();
        factory.close();
	}*/

	@Override
	public void fetchInternet(int internetId) {
		Configuration cfg = new Configuration();
		cfg.configure("mary.xml");
		
        cfg.addAnnotatedClass(InternetProviderDTO.class);
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        
        InternetProviderDTO internetProviderDTO = session.get(InternetProviderDTO.class, internetId);
        System.out.println(internetProviderDTO);
        session.getTransaction().commit();
        session.close();
        factory.close();
	}

	@Override
	public void updateInternetProvider(String name, int internetId) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("mary.xml");
		cfg.addAnnotatedClass(InternetProviderDTO.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session  session =factory.openSession();
		session.beginTransaction();
		
		InternetProviderDTO internetDTO = session.get(InternetProviderDTO.class, internetId);
		if(internetDTO != null) {
			internetDTO.setName(name);
			internetDTO.setPrice("1300");
			session.update(internetDTO);
			}
		session.getTransaction().commit();
        session.close();
        factory.close();	}

	@Override
	public void deleteInternetProvider(String name, int InternetId) {

		Configuration cfg = new Configuration();
		cfg.configure("mary.xml");
		cfg.addAnnotatedClass(InternetProviderDTO.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
		InternetProviderDTO internetDTO = session.get(InternetProviderDTO.class, 2);
		if(internetDTO != null) {
			session.delete(internetDTO);
		}
		session.getTransaction().commit();
		session.close();
		factory.close();

		
	}
	}
	
	
	


