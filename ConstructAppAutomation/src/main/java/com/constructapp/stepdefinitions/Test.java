package com.constructapp.stepdefinitions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import com.constructapp.utilities.DriverUtilities;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

		// get current date time with Date()
		Date date = new Date();

		// Now format the date
		String dateFormatted = dateFormat.format(date);

		System.out.println(dateFormatted);

		String[] dates = dateFormatted.split("/");

		LocalDate newdate = LocalDate.now().minusDays(1);

		LocalDate newdate1 = LocalDate.now().plusDays(3);

		String newrange = String.valueOf(newdate);
		System.out.println(newdate);

		String[] datevalues = newrange.split("-");

		int day = Integer.valueOf(datevalues[2]);
		String daytext = String.valueOf(day);
		;
		if (day <= 9) {
			daytext = "0" + daytext;
			System.out.println("daytext is" + daytext);
		}

		int month = Integer.valueOf(datevalues[1]);

		String actualMonth = DriverUtilities.getMonthForInt(month);
		
		int year = Integer.valueOf(datevalues[0]);
		
		newrange = actualMonth +" "+daytext+","+String.valueOf(year);
		
		

		String newrange1 = String.valueOf(newdate1);
		
		String[] datevalues1 = newrange1.split("-");

		int day1 = Integer.valueOf(datevalues1[2]);
		String daytext1 = String.valueOf(day1);
		;
		if (day1 <= 9) {
			daytext1 = "0" + daytext1;
			System.out.println("daytext1 is" + daytext1);
		}

		int month1 = Integer.valueOf(datevalues1[1]);

		String actualMonth1 = DriverUtilities.getMonthForInt(month1);
		
		int year1 = Integer.valueOf(datevalues1[0]);
		
		newrange1 = actualMonth1 +" "+daytext1+","+String.valueOf(year1);
		
		
		
		

		String range = newrange + " " + "- " + newrange1;

		System.out.println(range);

	}

}
