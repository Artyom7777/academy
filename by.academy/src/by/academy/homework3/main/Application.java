package by.academy.homework3.main;


import by.academy.homework3.Cheese;
import by.academy.homework3.Deal;
import by.academy.homework3.Meat;
import by.academy.homework3.Milk;
import by.academy.homework3.Person;
import by.academy.homework3.Wine;

public class Application {

	public static void main(String[] args) {
					
		Person seller = new Person("Vasya", 200.00, "+375331234565", "vas_a@gmai.com", "18.11.1984");
		Person buyer = new Person("Petya", 300.00, "+375331243446", "ptryha@gmai.com", "25.03.1980");

		Deal deal = new Deal("21-11-2020", seller, buyer);
//		System.out.println(deal.getDeadlineDate());

		deal.addProduct(new Meat(15.00, "MeatProduct", "Steak", 9, "Cow"));
		deal.addProduct(new Wine(7.00, "Alcohol", "Wine", 7, "Dry"));
		deal.addProduct(new Milk(3.00, "MilkProduct", "Milk", 15, "Yellow"));
		deal.addProduct(new Cheese(32.00, "MilkProduct", "Cheese", 15, "Yellow"));

		deal.printProducts();
		deal.deleteProduct(0);
		System.out.println("-----------------");
		deal.printProducts();
	}

}
