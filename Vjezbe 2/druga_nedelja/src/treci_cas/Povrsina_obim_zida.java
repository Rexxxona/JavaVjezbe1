package treci_cas;
import java.util.Scanner;

public class Povrsina_obim_zida {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner (System.in);
		
		double x1 = unos.nextDouble(), x2 = unos.nextDouble(), y1 = unos.nextDouble(), y2 = unos.nextDouble();
		
		double a = Math.abs(x1-x2);
		double b = Math.abs(y2-y1);
		
		double o = 2*a + 2*b;
		
		System.out.printf("Povrsina je : %.2fcm, obim je %.2fcm.", o);
		unos.close();
	}

}
