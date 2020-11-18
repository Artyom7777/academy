package by.academy.homework1;

public class Task2 {

	public static void main(String... args) {

		Object someVar = 1.5d;

		switch (someVar.getClass().getSimpleName()) {
		case "Integer":
			System.out.println((int) someVar % 2);

			break;
		case "Double":
			System.out.println((double) someVar * 0.7);

			break;
		case "Float":
			System.out.println(Math.pow((float) someVar, 2));

			break;
		case "Character":
			System.out.println((char) someVar);

			break;
		case "String":
			System.out.println("Hello " + someVar);

			break;
		default:
			System.out.println("Unsupportedtype");

		}
	}

}
