package by.academy.homework3;

public class Wine extends Product {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final double VINE_DISCOUNT = 0.6;
	
	 String sugar;

	public Wine(double price, String type, String producerName, int quantity, String sugar) {
		super(price, type, producerName, quantity);
		this.sugar = sugar;
	}
		
	public String getSugar() {
		return sugar;
	}

	public void setSugar(String sugar) {
		this.sugar = sugar;
	}

	@Override
	public double discount() {
		if (sugar.contains("Dry")){
			return VINE_DISCOUNT;
		}
		return 1;
	}

}

