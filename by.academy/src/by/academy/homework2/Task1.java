package by.academy.homework2;

public class Task1 {

	public static void main(String[] args) {

		boolean result = Task1.same("hello", "hlelo");
		System.out.println(result);
	}

	public static boolean same(String word1, String word2) {

		String[] letters = word1.split("");

		if (word1.length() != word2.length()) {
			return false;
		}

		for (String s : letters) {

			int key = -1;
			for (int n = 0; n < word2.length(); n++) {
				if (s.charAt(0) == word2.charAt(n)) {
					key = n;
				}
			}

			if (key < 0) {
				return false;
			}

			word2 = word2.substring(0, key) + word2.substring(key + 1);
		}

		return true;
	}
}
