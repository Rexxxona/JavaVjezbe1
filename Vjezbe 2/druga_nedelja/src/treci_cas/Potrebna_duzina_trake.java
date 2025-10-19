package treci_cas;
import java.util.Scanner;

public class Potrebna_duzina_trake {

	public static void main(String[] args) {
		
		double p, o, r;
		
		Scanner unos = new Scanner (System.in);
		System.out.print("Unesi povrsinu kruga: ");
		p = unos.nextDouble();
		
		r = Math.sqrt( p/ Math.PI);
		
		o = 2*r*Math.PI;
		
		System.out.printf("Duzina trake je %.2fcm.", o);
		
		unos.close();
	}

}
