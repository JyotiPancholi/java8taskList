
package com.date.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

//local Date Time and DateTime demo 
public class LocalDate_Time_DateTime {

	public static void localDateTimeAPI() {

		LocalDate date = LocalDate.now();
		System.out.println("the current date is " + date);

		LocalTime time = LocalTime.now();
		System.out.println("the current time is " + time);

		LocalDateTime current = LocalDateTime.now();
		System.out.println("current date and time : " + current);

		DateTimeFormatter formate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		String formatedDateTime = current.format(formate);
		System.out.println("in formatted manner :- " + formatedDateTime);

		Month month = current.getMonth();
		int day = current.getDayOfMonth();
		int second = current.getSecond();

		System.out.println("MONTH : " + month + " Day : " + day + " Second : " + second);

		LocalDate date2 = LocalDate.of(1950, 1, 26);
		System.out.println("the republic day :" + date2);

		LocalDateTime specificDate = current.withDayOfMonth(24).withYear(2016);

		System.out.println("specific date with " + "current time : " + specificDate);
	}
	

	public static void main(String[] args) {
		localDateTimeAPI();
		//------------------------------------------------------
		LocalDate date = LocalDate.now();    
	    LocalDate yesterday = date.minusDays(1);    
	    LocalDate tomorrow = yesterday.plusDays(2);    
	    System.out.println("Today date: "+date);    
	    System.out.println("Yesterday date: "+yesterday);    
	    System.out.println("Tomorrow date: "+tomorrow);    
	    //------------------------------------------------------
	    LocalDate date1 = LocalDate.of(2017, 1, 13);    
	    System.out.println(date1.isLeapYear()); 
	    LocalDateTime datetime = date1.atTime(1,50,9);      
	    System.out.println(datetime);  
	    //------------------------------------------------------
	    LocalDate date2 = LocalDate.of(2016, 9, 23);    
	    System.out.println(date2.isLeapYear());
	}
}
