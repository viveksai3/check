package com.example.demo.utils;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.exception.InsuffientFundsException;

public class BalanceCheck {
	private static Map<String, Double> obj = new HashMap<String, Double>();
	static {
		obj.put("acc1", 10000.0);
		obj.put("acc2", 8999.0);
	}
	
	public static boolean balcCheck(String accNo, Double fareAmt) {
		if(fareAmt>obj.get(accNo)) {
			throw new InsuffientFundsException("Insuffient Funds in your account");
		}else {
			return true;
		}
	}

}
