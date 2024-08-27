package circle;

public class Circle {

	public static void main(String[] args) {
				
		 CircleTest circle1 = new CircleTest(2.6);
	     CircleTest circle2 = new CircleTest(5.0);
		
	     double alan1 = circle1.getAlan();
	     double alan2 = circle2.getAlan();
	     
	     double cevre1 = circle1.getCevre();
	     double cevre2 = circle2.getCevre();
		
	     System.out.println("İlk Dairenin Yarıçapı: " + circle1.getYaricap());
	     System.out.println("İlk Dairenin Alanı: " + alan1);
	     System.out.println("İlk Dairenin Çevresi: " + cevre1);

	     System.out.println("İkinci Dairenin Yarıçapı: " + circle2.getYaricap());
	     System.out.println("İkinci Dairenin Alanı: " + alan2);
	     System.out.println("İkinci Dairenin Çevresi: " + cevre2);

	}

}

class CircleTest{
   private double yaricap;
   private static final double PI = Math.PI;
   
   public CircleTest(double yaricap) {
       this.yaricap = yaricap;
   }
   
   public double getYaricap() {
       return yaricap;
   }

public double getAlan() {
	   return PI * yaricap * yaricap;
   }
   
   public double getCevre() {
       return 2 * PI * yaricap;
   }
}
