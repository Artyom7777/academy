package by.academy.homework4;

public class ApplicationMyList {

	public static void main(String... args) {

		MyList<Integer> list = new MyList<>();

		list.add(22);
		list.add(25);
		list.add(9);
		list.add(5);
		list.add(27);
		list.add(2);
		list.add(4);
		list.add(3);
		list.add(28);
		list.add(29);
		list.add(30);
		list.add(21);
		list.add(32);
		list.add(20);
		list.add(33);
		list.add(34);
		list.add(35);
		list.add(36);
		list.add(30);

		System.out.println(list.get(19));
		System.out.println(list.get(1));

	}
}