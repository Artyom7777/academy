package by.academy.homework5;

public class ApplicationMyIteratorTwo {

	public static void main(String[] args) {

		Integer[][] arr = { { 8, 5, 1 }, { 6, 4, 2 } };

		MyIteratorTwo<Integer> iteratorTwo = new MyIteratorTwo<Integer>(arr);

		while (iteratorTwo.hasNext()) {
			System.out.print(iteratorTwo.next() + " ");
		}

	}

}
