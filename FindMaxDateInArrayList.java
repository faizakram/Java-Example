package com.examples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class FindMaxDateInArrayList {
	public static void main(String args[]) throws ParseException {
		  List<Date> dates = new ArrayList<Date>();
		  SimpleDateFormat fmt = new SimpleDateFormat("dd-MM-yyyy");
		  Date date = fmt.parse("07-06-2017");
		  Date dateOne = fmt.parse("05-06-2017");
		  Date dateTwo = fmt.parse("01-06-2018");
		  dates.add(date);
		  dates.add(dateOne);
		  dates.add(dateTwo);
		  // Using java.util.Collections
		  System.out.println("Maximum Element : "
		    + fmt.format(Collections.max(dates)));

		  // // Using Sort Technique of java.util.Collections
		  Collections.sort(dates);
		  System.out.println("Maximum Element After Sorting - "
		    + fmt.format(dates.get(dates.size() - 1)));

		 }
}
