package com.xworkz.mary.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.mary.dto.CurrencyDTO;

public class CurrencyDAOImpl implements CurrencyDAO{
	
    @Override
	public void saveCurrency(CurrencyDTO currencyDTO) {

    	Configuration configuration = new Configuration();
    	configuration.configure();
    	configuration.addAnnotatedClass(CurrencyDTO.class);
    	SessionFactory factory = configuration.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction tx = session.beginTransaction();
    	session.save(currencyDTO);
    	tx.commit();
    	session.close();
    	factory.close();
    	
    	

	}
	

}
