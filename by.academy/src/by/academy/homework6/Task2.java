package by.academy.homework6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {

	public static void main(String... args) throws FileNotFoundException, IOException {
		
		File dir = new File("C:\\Users\\User\\git\\academy\\by.academy\\src\\by\\academy\\homework6");

		if (!dir.exists()) {
			dir.mkdir();
		}

		File file = new File("C:\\Users\\User\\git\\academy\\by.academy\\src\\by\\academy\\homework6\\result.txt");

		if (!file.exists()) {
				file.createNewFile();
		} 
		
 
		StringBuilder sb = new StringBuilder();
		char[] charArr = new char[1024];

		try (BufferedReader br = new BufferedReader(new FileReader(
				"C:\\Users\\User\\git\\academy\\by.academy\\src\\by\\academy\\homework6\\Task2text.txt"))) {

			while (br.read(charArr) > 0) {
				sb.append(charArr);
			}
		}

		String str = sb.toString();

		try (BufferedWriter bw = new BufferedWriter(
			new FileWriter("C:\\Users\\User\\git\\academy\\by.academy\\src\\by\\academy\\homework6\\result.txt"))) {
			bw.write(str.replaceAll("\\s+", ""));
		}

		catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
