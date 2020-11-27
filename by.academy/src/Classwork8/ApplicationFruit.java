package Classwork8;

public class ApplicationFruit {
	
	public static void main(String... args) {
		
		Apple app = new Apple();
		Pear per = new Pear();
		Apricot apr = new Apricot();
		
		System.out.println(app.calcFruit());
		System.out.println(per.calcFruit());
		System.out.println(apr.calcFruit());
		
//		придумываем, что продали 20 яблок, 13 груш, 4 абрикоса
		
		System.out.println(app.allSum());
		System.out.println(per.allSum());
		System.out.println(apr.allSum());
		
		System.out.println(app.allSum() + per.allSum() + apr.allSum());
		
	}

}
