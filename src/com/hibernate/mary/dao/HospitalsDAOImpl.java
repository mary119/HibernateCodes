package com.hibernate.mary.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.internal.StandardServiceRegistryImpl;

import com.hibernate.mary.dto.HospitalsDTO;
import com.jdbc.singleton.HibernateSingleton;

public class HospitalsDAOImpl implements HospitalsDAO{
	
	private StandardServiceRegistry standardServiceRegistry = null;
	Session session = null;
	Transaction tx =null;
	
	@Override
	public void saveHospitalsDtls(HospitalsDTO hospitalsDTO) {
        /*try {
			
		standardServiceRegistry = new StandardServiceRegistryBuilder().configure().build();
		MetadataSources metadatasources = new MetadataSources(standardServiceRegistry);
		Metadata metadata =metadatasources.getMetadataBuilder().build();
		SessionFactory factory = metadata.getSessionFactoryBuilder().build();
		session = factory.openSession();
		Transaction tx =session.beginTransaction();
		session.save(hospitalsDTO);
		//beginTransaction().commit();

		factory.close();
        } catch (HibernateException e) {
    		session.close();
        		
        	}
		
        }*/
		
		try {
			session=HibernateSingleton.getSessionFactory().openSession();
			tx=session.beginTransaction();
			session.save(hospitalsDTO);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			// TODO: handle exception
		}finally
		{
			if(session!=null) {
				session.close();
			}
			
			
		}
		
		
	}
}


