package by.academy.homework5;

import java.util.Iterator;

public class MyIteratorTwo<T> implements Iterator<T> {
//	Написать итератор по двумерному массиву. (Отдельный класс. Наследуемся от Iterator<T>)
//	Протестировать в main.

	private T[][] arr;
	private int i, j;

	public MyIteratorTwo(T[][] arr) {
		this.arr = arr;
	}

	public T next() {
		T num = arr[i][j];
		j++;
		while (i < arr.length && j >= arr[i].length) {
			j = 0;
			i++;
		}
		return num;
	}

	@Override
	public boolean hasNext() {
		return (i < arr.length && j < arr[i].length);
	}
}
