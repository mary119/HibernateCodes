package com.xworkz.mary.util;

import com.xworkz.mary.dao.CurrencyDAO;
import com.xworkz.mary.dao.CurrencyDAOImpl;
import com.xworkz.mary.dto.CurrencyDTO;

public class CurrencyTester {

	public static void main(String[] args) {

		CurrencyDTO currencyDTO = new CurrencyDTO();
		currencyDTO.setCurrencyId(1);
		currencyDTO.setCurrencyName("rupee");
		currencyDTO.setCountry("INDIA");
		currencyDTO.setExchangeRateWRTUSDollar(73.34);

		CurrencyDAO currencyDAO = new CurrencyDAOImpl();
		currencyDAO.saveCurrency(currencyDTO);

	}
}

		
	


