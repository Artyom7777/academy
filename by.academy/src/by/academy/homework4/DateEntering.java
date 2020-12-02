package by.academy.homework4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import static java.time.temporal.ChronoUnit.DAYS;

public class DateEntering {

	public static String addTheDate() {

		Scanner enterDate = new Scanner(System.in);
		System.out.println("Enter a date (dd-mm-yyyy): ");
		String enDate = enterDate.nextLine();

		if (enDate == null || !enDate.matches("^\\d{1,2}-\\d{1,2}-\\d{4}$")) {
			System.out.println("Not vaid Date! Enter dd-mm-yyyy");
			return addTheDate();
		}
		SimpleDateFormat df = new SimpleDateFormat("dd-mm-yyyy");
		df.setLenient(false);
		try {
			df.parse(enDate);
			return enDate;
		} catch (ParseException ex) {
			System.out.println("Not vaid Date! Enter dd-mm-yyyy");
			return addTheDate();
		}
	}

	public static DayOfWeek dayOfWeek(String validDate) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate formatDate = LocalDate.parse(validDate, formatter);
		return formatDate.getDayOfWeek();

	}

	static long diffInDays(LocalDate a, LocalDate b) {
		return DAYS.between(a, b);
	}

	public static LocalDate addedDays(String b) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate locDate = LocalDate.parse(b, formatter);
		return locDate;
	}
}