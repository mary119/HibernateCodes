package com.xworkz.mary.dao;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.xworkz.mary.dto.PoliticalPartyDTO;


public  class PoliticalPartyDAOImpl implements PoliticalPartyDAO{

     //private SessionFactory factory = null;
       private StandardServiceRegistry standardServiceRegistry ;

     
     public PoliticalPartyDAOImpl() {
    	 
     }

	@Override
	public void savePoliticalParty(PoliticalPartyDTO partyDTO) {
		// TODO Auto-generated method stub
		
	}

	

	/*@Override
	public void savePoliticalParty(PoliticalPartyDTO partyDTO) {
		Session session = null;
		Transaction tx = null;
		try {
		
		    Configuration configuration = new Configuration();
		    configuration.configure();
		    factory = configuration.buildSessionFactory();
		    session=factory.openSession();
		    tx=session.beginTransaction();
		    session.save(partyDTO);
		    session.getTransaction().commit();
		  
		    session.close();
		    factory.close();
	    } catch (HibernateException e) {

	    	if(tx!=null) {
	    		tx.rollback();

	    	}
	    	e.printStackTrace();

	    }		
	}*/
	@Override
	public PoliticalPartyDTO fetchData(int id) {
		standardServiceRegistry = new StandardServiceRegistryBuilder().configure().build();
		MetadataSources metadataSources = new MetadataSources(standardServiceRegistry);
		Metadata metadata = metadataSources.getMetadataBuilder().build();
		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
		Session session = sessionFactory.openSession();
		PoliticalPartyDTO partyDTO = session.load(PoliticalPartyDTO.class, id);
		System.out.println(partyDTO);

		
		 partyDTO = session.get(PoliticalPartyDTO.class, id);
		System.out.println(partyDTO);
		session.close();
		sessionFactory.close();

		return partyDTO;
	}
}

	

		


	

	
		
		
 
	    	
	    	
	   
		

		
		
	


