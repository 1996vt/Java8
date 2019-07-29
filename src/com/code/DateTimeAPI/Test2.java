package com.code.DateTimeAPI;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Test2{ 

public static void ZonedTimeAndDate() 
{ 
	LocalDateTime date = LocalDateTime.now(); 
	DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 
	
	String formattedCurrentDate = date.format(format1); 
	
	System.out.println("Formatted current Date and"+" Time : "+formattedCurrentDate); 

	ZonedDateTime currentZone = ZonedDateTime.now(); 
	System.out.println("The current zone is "+currentZone.getZone()); 

	ZoneId phoenix = ZoneId.of("America/Phoenix"); 

	ZonedDateTime phoenixZone = currentZone.withZoneSameInstant(phoenix); 
					
	System.out.println("Phoenix time zone is " +phoenixZone); 

	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 
	
	String formatedDateTime = phoenixZone.format(format); 

	System.out.println("Formatted Phoenix time zone "+ formatedDateTime); 
	
} 
	
	
	public static void main(String[] args) 
	{ 
		
		ZonedTimeAndDate(); 
		
	} 
} 

