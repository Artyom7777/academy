package by.academy.homework2;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		// Èíèöèàëèçàöèÿ ïåðåìåííûõ
		Scanner scr = new Scanner(System.in);
		System.out.println("Ââåäèòå ïåðâîå ñëîâî ñ ÷åòíûì êîëè÷åñòâîì ñèìâîëîâ:");
		String one = scr.nextLine();
		System.out.println("Ââåäèòå âòîðîå ñëîâî ñ ÷åòíûì êîëè÷åñòâîì ñèìâîëîâ:");
		String two = scr.nextLine();

		// Èñêëþ÷àåì ñëîâà ñ íå ÷åòíûì êîëè÷åñòâîè ñèìâîëîâ
		if (one.length() % 2 != 0 || two.length() % 2 != 0) {
			System.out.println(false);

		} else { // Ñîåäåíÿåì ÷àñòè ñëîâ

			int numOne = one.length() / 2;
			int numTwo = two.length() / 2;

			int firstOne = 0;
			int lastOne = two.length();

			System.out.println(one.substring(firstOne, numOne) + two.substring(numTwo, lastOne));
		}
	}
}
