package by.academy.homework6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {

	public static void main(String... args) throws FileNotFoundException, IOException {

				File dir = new File("C:\\Users\\User\\git\\academy\\by.academy\\src\\by\\academy\\homework6");

		if (!dir.exists()) {
			dir.mkdir();
		}

		File file = new File("C:\\Users\\User\\git\\academy\\by.academy\\src\\by\\academy\\homework6\\Task1.txt");

		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}
		}

		Scanner src = new Scanner(System.in);
		System.out.println("Enter text (Stop string is 'stop'): ");
		String text = src.nextLine();
		
		String[] strArr = text.split(" ");
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter ("C:\\Users\\User\\git\\academy\\by.academy\\src\\by\\acadmy\\homework6\\Task1.txt"))) {
			
			for(String words : strArr) {
				if (words.equals("stop")) {
					System.out.println("You entered STOP string");
					break;
				} else {
					writer.write(words + " ");
				}
			}
		} 
		src.close();
	}
}
