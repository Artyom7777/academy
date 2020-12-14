package by.academy.homework5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task5<D, S> {

	public static void main(String... args) {

		System.out.println("Type some text:");
		Scanner sr = new Scanner(System.in);
		String string = sr.nextLine();

		char[] chars = string.toCharArray();
		Map<Character, Integer> charsCounter = new HashMap<Character, Integer>();
		for (char a : chars) {
			if (!charsCounter.containsKey(a)) {
				charsCounter.put(a, 0);
			}
			charsCounter.put(a, charsCounter.get(a) + 1);
		}
		for (char b : charsCounter.keySet()) {

			System.out.println("Value: " + b + " " + "Frequency: " + charsCounter.get(b));
		}

	}

}
