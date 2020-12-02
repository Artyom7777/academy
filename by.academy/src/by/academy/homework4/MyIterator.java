package by.academy.homework4;

public class MyIterator<T> {

	private T[] arr;
	private int index;

	public MyIterator() {
		super();
	}

	public MyIterator(T[] arr) {
		this.arr = arr;
	}

	public boolean hasNext() {
		if (arr == null || arr.length <= index) {
			return false;
		}
		return arr[index] != null;
	}

	public T next() {
		return arr[index++];
	}
}
