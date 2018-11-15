package com.cg.banking.util;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Random;

import com.cg.banking.dto.Customer;

public class DButil {
	static Random rand = new Random();
	public static HashMap<String, Customer> bankDBMap = new HashMap<>();
	public static HashMap<String, String> bankCredentialsDBMap = new HashMap<>();
	static {
		bankCredentialsDBMap.put("16001", "aa101");
		bankDBMap.put("16001",new Customer("16001", "Aakarsh Bhatnagar", LocalDate.of(1995,Month.DECEMBER, 20), "Saving", 18000.0F, 100000.0));
		
		bankCredentialsDBMap.put("16002", "ay102");
		bankDBMap.put("16002", new Customer("16002", "Ayush Kr. Srivastava",LocalDate.of(2018, Month.APRIL, 1), "Saving", 18550.0F,100000.0));
		
		bankCredentialsDBMap.put("16003", "ab103");
		bankDBMap.put("16003", new Customer("16003", "Abhishek Verma",LocalDate.of(2018, Month.SEPTEMBER, 19), "Current", 19500.0F,100000.0));
		
		bankCredentialsDBMap.put("16004", "aay104");
		bankDBMap.put("16004",new Customer("16004", "Aayushi Bhatnagar", LocalDate.of(2017,Month.SEPTEMBER, 26), "Current", 19500.0F, 100000.0));
	}

	public static String newCustomer(String password, Customer customer) {
		bankCredentialsDBMap.put(customer.getAccNumber(), password);
		bankDBMap.put(customer.getAccNumber(), customer);
		return customer.getAccNumber();
	}

	public static HashMap<String, String> getAllCustCred() {
		return bankCredentialsDBMap;
	}

	public static HashMap<String, Customer> getAllCustomer() {
		return bankDBMap;
	}
}
