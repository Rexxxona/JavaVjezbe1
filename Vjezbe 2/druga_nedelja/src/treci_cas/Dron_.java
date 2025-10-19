package treci_cas;
import java.util.Scanner;

public class Dron_ {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Pocetnu x koordinatu drona\n");
		double xD = unos.nextDouble();
		
		System.out.print("Pocetnu y koordinatu drona\n");
		double yD = unos.nextDouble();
		
		System.out.print("Unesite broj paketa\n");
		double N = unos.nextDouble();
		
		double xP, yP, UD, zUD = 0 ;
	
		for (int i = 0; i < N; i++);
			xP = (Math.random() * 10);
			yP = (Math.random() * 10);
			UD = Math.sqrt(Math.pow((yP-yD), 2) + Math.pow((xP-xD), 2));
			zUD += UD;
		System.out.printf("Zbirna udaljenost svih rastojanja od drona je: %.2f", zUD);
	}

}
