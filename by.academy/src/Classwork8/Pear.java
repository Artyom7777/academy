package Classwork8;

public class Pear extends Fruit{
	
//	public static final double PEAR_WEITH = 0.16;
	public static final double PEAR_KG_COST = 3.99;
	private double oneFruitCost;
	public int quantity = 13;
	double sum;

	@Override
	double calcFruit() {
		oneFruitCost = PEAR_KG_COST * weith;
		return oneFruitCost;
	}
	
	double allSum() {
		sum = quantity * calcFruit();
		return sum;
	}
	
	

}
