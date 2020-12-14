package by.academy.homework5;

import java.util.Collection;
import java.util.HashSet;

public class Task1<T> {

	public static <T> Collection<T> withoutDubl(Collection<T> collect) {
		return new HashSet<>(collect);
	}
}