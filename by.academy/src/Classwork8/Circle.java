package Classwork8;

public class Circle {
	
	public static final double PI = 3.1415926536;
	
	private Integer radius = 35;
	public double len;
	public double s;

	double ploschad() {
		s = PI*Math.pow(radius, 2);
		return s;
				
	}
	
	double dlinna() {
		len = 2*PI*radius;
		return len;
		
	}
	
		

}
