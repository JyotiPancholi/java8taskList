package com.date.time;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class LocalTimeDemo {

	public static void main(String[] args) {
		LocalTime time = LocalTime.of(10, 43, 12);
		System.out.println(time);

		LocalTime time2 = time.minusHours(2);
		LocalTime time3 = time2.minusMinutes(34);
		System.out.println(time3);
		
		LocalTime time4=time.plusHours(4);  
	    LocalTime time5=time4.plusMinutes(18);  
	    System.out.println(time5);  
	    
	    ZoneId zone1 = ZoneId.of("Asia/Kolkata");  
	    ZoneId zone2 = ZoneId.of("Asia/Tokyo");  
	    LocalTime time6 = LocalTime.now(zone1);  
	    System.out.println("India Time Zone: "+time6);  
	    LocalTime time7 = LocalTime.now(zone2);  
	    System.out.println("Japan Time Zone: "+time7);  
	    long hours = ChronoUnit.HOURS.between(time6, time7);  
	    System.out.println("Hours between two Time Zone: "+hours);  
	    long minutes = ChronoUnit.MINUTES.between(time6, time7);  
	    System.out.println("Minutes between two time zone: "+minutes);  
	}
}
