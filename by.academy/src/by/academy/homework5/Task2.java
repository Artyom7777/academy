package by.academy.homework5;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task2 {

	public static void arrAndLinckLists() {
		ArrayList<Double> arrList = new ArrayList<>();
		LinkedList<Double> linkList = new LinkedList<>();
		final int n = 1000000;
		final int j = 100;
		for (int i = 0; i < n; i++) {
			arrList.add(Math.random());
			linkList.add(Math.random());
		}
		long timeArr = System.currentTimeMillis();
		for (int i = 0; i < j; i++) {
			arrList.get((int) (Math.random() * (n - 1)));
		}
		System.out.println(System.currentTimeMillis() - timeArr);

		long timeLink = System.currentTimeMillis();
		for (int i = 0; i < j; i++) {
			linkList.get((int) (Math.random() * (n - 1)));
		}
		System.out.println(System.currentTimeMillis() - timeLink);
	}

}
