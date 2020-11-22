package com.hibernate.mary.dao;

import com.hibernate.mary.dto.SportsDTO;

public interface SportsDAO {
	public void saveSportsDtls(SportsDTO sportsdto);
	public  SportsDTO fetchData (int id );

}
