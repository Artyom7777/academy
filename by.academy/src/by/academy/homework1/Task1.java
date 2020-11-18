package by.academy.homework1;

public class Task1 {

	public static void main(String... args) {

		double sum;
		int bAge;
		sum = 45;
		bAge = 14;
		double Value = sum;

		if (sum > 0 && sum < 99) {
			Value = sum / 1.05;

		} else if (sum >= 100 && sum < 200) {
			Value = sum / 1.07;

		} else if (sum >= 200 && sum < 300) {

			if (bAge > 18)
				Value = sum / (1.12 + 0.04);
			else
				Value = sum / (1.12 - 0.03);

		} else if (sum >= 300 && sum < 400) {
			Value = sum / 1.15;

		} else if (sum >= 400) {
			Value = sum / 1.15;

		}

		System.out.printf("Ńóěěŕ: %.2f", Value);
	}

}
