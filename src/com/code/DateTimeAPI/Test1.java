package com.code.DateTimeAPI;

import java.time.*; 
import java.time.format.DateTimeFormatter; 

public class Test1{ 

public static void LocalDateTimeApi() 
{ 
 
	LocalDate date = LocalDate.now(); 
	System.out.println("the current date is "+ date); 

	LocalTime time = LocalTime.now(); 
	System.out.println("the current time is "+ time); 
	
	LocalDateTime current = LocalDateTime.now(); 
	System.out.println("current date and time : "+ current); 

	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 
	
	String formatedDateTime = current.format(format); 
	
	System.out.println("in foramatted manner "+ formatedDateTime); 

	Month month = current.getMonth(); 
	int day = current.getDayOfMonth(); 
	int seconds = current.getSecond(); 
	System.out.println("Month : "+month+" Day : "+day+" Seconds : "+seconds); 

	LocalDate date2 = LocalDate.of(1996,10,23); 
	System.out.println("The Specified day :"+date2); 
 
	LocalDateTime specificDate = current.withDayOfMonth(24).withYear(2016); 

	System.out.println("Date with "+ "current time : "+specificDate); 
} 

	public static void main(String[] args) 
	{ 
		LocalDateTimeApi(); 
	}
} 
