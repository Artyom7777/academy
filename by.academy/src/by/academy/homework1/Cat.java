package by.academy.homework1;

public class Cat {
	
	int Age;
	String nickname;
	double money;
	char initials;
	boolean isHomeAnimal;
	
	public Cat() {
	}
	
	public Cat(String nickname) {
		this.nickname = nickname;
		this.setInitials(nickname.charAt(0));

	}
	
	public void grow() {
		this.Age += 1;
	}
	
	public void sleep() {
		System.out.println("Êîò ñïèò");
	}
	
	public void eat() {
		System.out.println("Êîò åñò");
	}
	
	public void walk() {
		System.out.println("Êîò ãóëÿåò");
	}
	
	public void setMoney(double money) {
		this.money = money;
	}
	
	public void setInitials(char initials) {
		this.initials = initials;
	}
	
	public void setHomeAnimal(boolean isHomeAnimal) {
		this.isHomeAnimal = isHomeAnimal;
	}
	
	public int getAge() {
		return Age;
	}
	
	public double getMoney() {
		return money;
	}
	
	public char getInitials() {
		return initials;
	}
	public boolean isHomeAnimal() {
		return isHomeAnimal;
	}
	

}
