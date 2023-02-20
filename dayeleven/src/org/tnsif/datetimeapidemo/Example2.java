package org.tnsif.datetimeapidemo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example2 {

	public static void main(String[] args) {
		String datetime="2022-04-27 18:17";
		DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime l=LocalDateTime.parse(datetime, df);
		System.out.println(l);

	}

}
