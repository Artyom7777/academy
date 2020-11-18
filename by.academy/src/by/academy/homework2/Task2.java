package by.academy.homework2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		// Ñîçäàåì ñêàíåð
		Scanner scr = new Scanner(System.in);
		System.out.println("Âåäèòå ïðåäëîæåíèå:");
		String vvod = scr.nextLine();

		// Ñîõðàíÿåì ñëîâà â ìàññèâ
		String[] text = vvod.split(" ");

		int key = -1;
		int length = -1;
		for (int i = 0; i < text.length; i++) {
			if (text[i].length() < length || length < 0) {
				length = text[i].length();
				key = i;
			}
		}

		if (key >= 0) {
			System.out.println(text[key]);
			return;
		}

		System.out.println(false);
	}

}
