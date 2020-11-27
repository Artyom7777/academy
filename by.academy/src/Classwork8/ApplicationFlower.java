package Classwork8;

public class ApplicationFlower {
	
	static int Flowers = 0;
	
	public static void main(String... args) {
		Tulip tulip = new Tulip("Norway", "FlowersSolushen", 17, 1.5);
		Rose rose = new Rose("Belarus", "Bel Flowers", 10, 4.5);
		Clove clove = new Clove("Belgium", "Beowers", 21, 3.81);
		Lily lily = new Lily("Indonesia", "Flo inc.", 34, 9.45);
		
		
		Flower[] b1 = {lily, lily, tulip, tulip, tulip};
		Flower[] b2 = {rose, rose, rose, rose, rose};
		Flower[] b3 = {clove, clove, rose, rose, rose, tulip, tulip};
		
		Bouquet bouquet1 = new Bouquet(b1);
		Bouquet bouquet2 = new Bouquet(b2);
		Bouquet bouquet3 = new Bouquet(b3);
		
		Bouquet[] bb = {bouquet1, bouquet2, bouquet3};
		
		System.out.println(bouquet1.calcSumm());
		System.out.println(bouquet2.calcSumm());
		System.out.println(bouquet3.calcSumm());
		
		for(Bouquet v: bb) {
			Flowers += v.calcCol();
					
		}
		
		System.out.println(Flowers);
		
		
		
	}

}
