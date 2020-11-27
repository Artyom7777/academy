package Classwork8;

public class Apricot extends Fruit{
	
//	public static final double APRICOT_WEITH = 0.21;
	public static final double APRICOT_KG_COST = 5.15;
	private double oneFruitCost;
	public int quantity = 4;
	double sum;
	
	@Override
	double calcFruit() {
		oneFruitCost = APRICOT_KG_COST * weith;
		return oneFruitCost;
	}
	
	double allSum() {
		sum = quantity * calcFruit();
		return sum;
	}
	
	

}
