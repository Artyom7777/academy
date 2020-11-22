package by.academy.homework3;

public class Meat extends Product {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final double MEAT_DISCOUNT = 0.8;
	 String animalMade;

	public Meat(double price, String type, String producerName, int quantity, String animalMade) {
		super(price, type, producerName, quantity);
		this.animalMade = animalMade;
	}
		
	public String getAnimalMade() {
		return animalMade;
	}

	public void setAnimalMade(String animalMade) {
		this.animalMade = animalMade;
	}

	@Override
	public double discount() {
		if (producerName.contains("Bel")){
			return MEAT_DISCOUNT;
		
	}
		return 1;
	}
}

