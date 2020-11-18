package by.academy.homework1;

public class Task4 {

	public static void main(String... args) {

		int num = 2;
		int res = 1;
		int ste = 1;

		while (res < 1_000_000) {

			res = res * num;
			System.out.println(num + " â ñòåïåíè " + ste + " = " + res);
			ste++;
		}
	}
}
