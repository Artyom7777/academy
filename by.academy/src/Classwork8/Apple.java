package Classwork8;

public class Apple extends Fruit{
	
//	public static final double APPLE_WEITH = 0.10;
	public static final double APPLE_KG_COST = 2.10;
	private double oneFruitCost;
	public int quantity = 20;
	double sum;
	
	@Override
	double calcFruit() {
		oneFruitCost = APPLE_KG_COST * weith;
		return oneFruitCost;
	}
	
	double allSum() {
		sum = quantity * calcFruit();
		return sum;
		
	}
	
}
	