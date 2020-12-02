package by.academy.homework4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ApplicationDate {

	public static void main(String[] args) {

		String validDate = DateEntering.addTheDate();
		// т.к. уже имеется встроеный enum дней недели - свой не создавал.
		System.out.println(DateEntering.dayOfWeek(validDate));

		// вторая дата для сравнения - текущая.
		System.out.println(DateEntering.diffInDays(DateEntering.addedDays(validDate), Date.today));

		// проверка года на высокостность.
		Year.isLeapYear();
	}
}
