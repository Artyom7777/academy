package by.academy.homework5;

import java.util.Collection;
import java.util.HashSet;

public class Task1<T> {

//	Можно писать все в main. Не нужно создавать новых классов.
//	Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию 
//	уже без дубликатов.

	public static <T> Collection<T> withoutDubl(Collection<T> collect) {
		return new HashSet<>(collect);
	}
}