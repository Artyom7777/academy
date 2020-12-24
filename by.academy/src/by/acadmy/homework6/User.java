package by.acadmy.homework6;

public class User {
	
	private String firstName;
	private String lastNamr;
	private int age;
		
	public User(String firstName, String lastNamr, int age) {
		super();
		this.firstName = firstName;
		this.lastNamr = lastNamr;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastNamr() {
		return lastNamr;
	}

	public void setLastNamr(String lastNamr) {
		this.lastNamr = lastNamr;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

}
