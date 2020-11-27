package Classwork8;

public abstract class Fruit {
	
//  считаем, что weit - вес одного фрукта (т.к. не указано, что за вес)
	int weith = 7;
	
	final void printManufacturerInfo() {
		System.out.print("Made in Ukraine");
	}
	
	abstract double calcFruit();
	
}
