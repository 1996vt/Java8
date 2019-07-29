package com.code.DateTimeAPI;
 
import java.time.*;
 

public class Test3 { 

	public static void Period() 
	{ 
		LocalDate date1 = LocalDate.now(); 

		LocalDate date2 = LocalDate.of(2018, Month.JUNE, 28); 

		Period difference = Period.between(date2, date1); 
		System.out.println("Difference between dates "+ "is a period of "+difference); 
	} 

	public static void Duraion() 
	{ 

		LocalTime time1 = LocalTime.now(); 
		System.out.println("the current time is " + time1); 

		Duration fiveHours = Duration.ofHours(-5); 

		LocalTime time2 = time1.plus(fiveHours); 

		System.out.println("Incrementing 5 hours"+"of duration " + time2); 

		Duration difference = Duration.between(time2, time1); 
		System.out.println("duraion gap between time1"+" & time2 is "+ difference); 
} 

	public static void main(String[] args) 
	{ 
		Period(); 
		Duraion(); 
	} 
} 
