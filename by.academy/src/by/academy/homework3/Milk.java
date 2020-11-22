package by.academy.homework3;

public class Milk extends Product {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final double MILK_DISCOUNT = 0.5;
	String color;

	public Milk(double price, String type, String producerName, int quantity, String color) {
		super(price, type, producerName, quantity);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public double discount() {
		if (producerName.contains("a")) {
			return MILK_DISCOUNT;

		}
		return 1;
	}
}
