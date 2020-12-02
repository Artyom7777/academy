package by.academy.homework4;

public class MyList<T> {

	T[] arr;

	public MyList() {
		arr = (T[]) (new Object[16]);
	}

	public MyList(int a) {
		arr = (T[]) (new Object[a]);

	}

	public void add(T obj) {
		int index = getLastIndex();
		if (getLength() - 1 > index) {
			arr[index + 1] = obj;
			
		} else {
		T[] tempArray = (T[]) new Object[arr.length * 2 + 1];
		System.arraycopy(arr, 0, tempArray, 0, arr.length);
		arr = tempArray;
		arr[index + 1] = obj;
		}
	}

	public <T> Object get(int i) {
		return arr[i];
	}

	public <T> Object getLast() {
		return arr[arr.length - 1];

	}

	public <T> Object getFirst() {
		return arr[0];
	}

	public int getLength() {
		return arr.length;

	}

	public int getLastIndex() {
		for (int p = arr.length - 1; p >= 0; p--) {
			if (arr[p] != null) {
				return p;
			}
		}

		return -1;

	}

	void removeIndex(int i) {

		T[] tempArray = (T[]) new Object[arr.length - 1];
		int index = i;

		System.arraycopy(arr, 0, tempArray, 0, index);
		System.arraycopy(arr, index + 1, tempArray, index, arr.length - index - 1);
		arr = (T[]) tempArray;
	}

	public void removeObject(T obj) {
		for (int i = 0; i < arr.length; i++)
			if (arr[i] == obj) {
				removeIndex(i);
			}
	}
}
