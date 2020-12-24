package by.acadmy.homework6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class Main implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static void main(String... args) throws IOException {
		
		ArrayList<User> userArr = new ArrayList<User>();
		
		userArr.add(new User("Pavel", "Semenov", 45));
		userArr.add(new User("Volodia", "Kartonov", 32));
		userArr.add(new User("Sendy", "Depth", 12));
		userArr.add(new User("Ronald", "Wiskey", 54));
		userArr.add(new User("John", "Travolta", 28));
		userArr.add(new User("Kurt", "Cobain", 18));
		userArr.add(new User("Aleksandr", "Bond", 31));
		userArr.add(new User("Victoria", "Secret", 44));
		userArr.add(new User("Lidia", "Shtein", 26));
		userArr.add(new User("Kate", "Winter", 55));
		userArr.add(new User("Elena", "Barkley", 23)); 
		
		File dir = new File("C:\\Users\\User\\git\\academy\\by.academy\\src\\by\\acadmy\\homework6\\users");

			if (!dir.exists()) {
				dir.mkdir();
		}
		
		for (int i = 0; i < userArr.size(); i++) {
			File file = new File(dir, userArr.get(i).getFirstName() + "_" + userArr.get(i).getLastNamr() + ".txt");
			
			if (!file.exists()) {
				file.createNewFile();
			}
			try (FileWriter fw = new FileWriter(file)) {
					fw.write(userArr.get(i).getFirstName() + " " + userArr.get(i).getLastNamr() + " "
							+ userArr.get(i).getAge());
					
			}catch (Exception e) {
				System.err.println(e.getMessage());
				
			}
		}
	}
}
