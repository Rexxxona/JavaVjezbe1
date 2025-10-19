package treci_cas;

import java.util.Scanner;

public class Povrsina_obim {

	public static void main(String[] args) {
	
		double a, b, p, o;
		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesi vrijednost stranice a: ");
		a = unos.nextDouble();
		
		System.out.println("Unesi vrijednost stranice b: ");
		b = unos.nextDouble();
		
		p = a * b;
		o = 2*a + 2*b;
		
		System.out.printf("Povrsina je: %.2f \na obim je: %.2f", p, o);
		
		unos.close();
	}

}
