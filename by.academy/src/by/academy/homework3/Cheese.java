package by.academy.homework3;

public class Cheese extends Product {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final double CHEESE_DISCOUNT = 0.9;
	
	 String qualityOfYears;

	public Cheese(double price, String type, String producerName, int quantity, String qualityOfYears) {
		super(price, type, producerName, quantity);
		this.qualityOfYears = qualityOfYears;
	}
	
	
	public String getQualityOfYears() {
		return qualityOfYears;
	}

	public void setQualityOfYears(String qualityOfYears) {
		this.qualityOfYears = qualityOfYears;
	}

	@Override
	public double discount() {
		if (producerName.contains("ch")){
			return CHEESE_DISCOUNT;
		}
		return 1;
	}

}
