package by.academy.homework7;

public class User extends Person {
	
	public String login;
	private String password;
	protected String email;
	
	

	public User(String login, String password, String email) {
		
		this.login = login;
		this.password = password;
		this.email = email;
	}
	
	private void printUserInfo() {
		System.out.println("Print User Info: ");
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
