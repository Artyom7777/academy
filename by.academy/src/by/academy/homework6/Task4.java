package by.academy.homework6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task4 {

	public static void main(String... args) throws FileNotFoundException, IOException {
		
		File dir = new File("C:\\Users\\User\\git\\academy\\by.academy\\src\\by\\academy\\homework6\\Task4files");

		if (!dir.exists()) {
			dir.mkdir();
		}
		
		File dir1 = new File("C:\\Users\\User\\git\\academy\\by.academy\\src\\by\\academy\\homework6");

		if (!dir.exists()) {
			dir.mkdir();
		}

		File src = new File(
				"C:\\Users\\User\\git\\academy\\by.academy\\src\\by\\acadmy\\homework6\\Task2text.txt");

		if (!src.exists()) {
			return;
		}


		BufferedReader br = new BufferedReader(new FileReader(src));

		String str = br.readLine();

		int size = str.length();

		System.out.println(size);

		int randomNum = (int) (Math.random() * size);

		for (int i = 0; i < 100; i++) {
			File filesCreating = new File(dir, (i + 1) + ".txt");

			if (!filesCreating.exists()) {
				filesCreating.createNewFile();
			}

			try (FileWriter bf = new FileWriter(filesCreating)) {

				bf.write(str.substring(0, randomNum));
			} 
			
		}

        File fileResult = new File(dir1, "Task4result.txt");
        
        try (FileWriter folder = new FileWriter(fileResult)) {
        	
            for (File files : dir.listFiles()) {
                System.out.println("Name: " + files.getName() + " size: " + files.length());
                folder.write("Name: " + files.getName() + " size: " + files.length() + "\n");
            }
		}
        br.close(); 		
	}
}
