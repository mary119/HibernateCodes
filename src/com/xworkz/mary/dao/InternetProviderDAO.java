package com.xworkz.mary.dao;

import com.xworkz.mary.dto.InternetProviderDTO;

public interface InternetProviderDAO {

	public void save(InternetProviderDTO dto);
	public void fetchInternet(int internetId);
	public void updateInternetProvider(String name, int internetId);
	public void deleteInternetProvider(String name, int internetId);
}
