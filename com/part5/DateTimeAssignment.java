package com.part5;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjuster;

public class DateTimeAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercise 1
		LocalDate today = LocalDate.now();
		System.out.println("Birthdate: " + LocalDateTime.now());
		
		// Exercise 2
		//LocalDate date = date.with(TemporalAdjuster.previous(DayOfWeek.THURSDAY));
		
		// Exercise 4
		ZonedDateTime zdt = ZonedDateTime.ofInstant(Instant.now(),
                ZoneId.systemDefault());
		
		Instant inst = ZonedDateTime.now().toInstant();
		
		
	}

}
