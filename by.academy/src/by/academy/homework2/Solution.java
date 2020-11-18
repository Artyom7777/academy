package by.academy.homework2;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

	// Complete the pairs function below.
	static int pairs(int k, int[] arr) {
		int pairsCount = 0;

		for (int r = 0; r < arr.length; r++) {
			for (int e = 0; e < arr.length; e++) {
				if (k == arr[r] - arr[e]) {
					pairsCount++;
				}
			}
		}
		// write code here
		return pairsCount;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		String[] nk = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nk[0]);

		int k = Integer.parseInt(nk[1]);

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(arrItems[i]);
		// убрал System.out.println(arr[i]);
		}

		int result = pairs(k, arr);
		System.out.println(result);

		scanner.close();
	}
}
