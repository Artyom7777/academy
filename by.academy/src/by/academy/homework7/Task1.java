package by.academy.homework7;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Task1 {
	
	private static final double PI = 3.14;

	public static void main(String... args) {
		
		List<Long> list = new Random().longs(100, 0, 100).map(i -> (long) (i * PI - 20))
				.filter(i -> i > 0 && i < 100).sorted().skip(3).distinct().boxed()
				.peek(i -> System.out.println(i)).collect(Collectors.toList());

		Map<Long, String> map = list.stream().collect(Collectors
				.toMap(i -> i, i -> " Number: " + i));

		System.out.println(map);
	}

} 
