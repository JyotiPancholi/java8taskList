package com.date.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();  
        System.out.println("Before Formatting: " + now);  
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
        String formatDateTime = now.format(format);  
        System.out.println("After Formatting: " + formatDateTime);
        
        LocalDateTime datetime1 = LocalDateTime.now();  
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
        String formatDateTime1 = datetime1.format(format1);   
        System.out.println(formatDateTime1); 
	}
}
