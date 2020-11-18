package by.academy.homework1;

public class Application {
	
	public static void main (String ...args) {
		Cat noname = new Cat();
		Cat named = new Cat("Vasia");
		
		named.eat();
		named.sleep();
		named.walk();
		
		noname.grow();
		noname.grow();
		noname.grow();
		named.setHomeAnimal(true);
		System.out.println(noname.Age);
		
		int catAge = noname.getAge();
		
		System.out.println(catAge);
		System.out.println(named.money);
		System.out.println(named.getInitials());
		System.out.println(named.isHomeAnimal());
	}

}
