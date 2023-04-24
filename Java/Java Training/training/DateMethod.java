package training;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class DateMethod {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
//		LocalTime time = LocalTime.now();
		LocalDate birthday = LocalDate.of(2001,10,18);
		Period p = Period.between(birthday,today);
		System.out.printf("Year : "+p.getYears()+" Month : "+p.getMonths()+" Day : "+p.getDays());
	}

}
