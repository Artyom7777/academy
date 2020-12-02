package by.academy.homework4;

import java.time.LocalDate;
import java.util.Scanner;

public class Date {

	static LocalDate today = LocalDate.now();

	public Date() {
		new Year();
		new Mounth();
		new Day();
	}
}

class Year {

	public static void isLeapYear() {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = input.nextInt();

		if (year < 1582 && year % 4 == 0) {
			System.out.println(year + " is a leap year");
		} else if (year < 1582) {
			System.out.println(year + " is not a leap year");
		} else if (year >= 1582 && (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}
	}
}

class Mounth {

}

class Day {

}
