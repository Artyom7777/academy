package by.academy.homework5;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {

	public static void main(String... args) {

		ArrayList<Integer> mark = new ArrayList<Integer>();

		for (int i = 0; i < 20; i++) {
			int a = (int) (Math.random() * 10 + 1);
			mark.add(a);
		}

		Integer higherNum = 0;
		Iterator<Integer> iterator = mark.iterator();
		while (iterator.hasNext()) {
			Integer val = iterator.next();
			if (val > higherNum) {
				higherNum = val;
			}
		}
		System.out.println(higherNum);
	}

}
