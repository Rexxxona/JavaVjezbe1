package treci_cas;

import java.util.Scanner;

public class Sirina_visina_papira {

	public static void main(String[] args) {
		double a, b, p, pKvadratno;
		
		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesi vrijednost stranice a: ");
		a = unos.nextDouble();
		
		System.out.println("Unesi vrijednost stranice b: ");
		b = unos.nextDouble();
		
		p = a * b;
		pKvadratno = p/100;
		
		System.out.printf("Povrsina lista papira u kvadratnim centimetrima je: %.2fcm", pKvadratno);
		unos.close();
	}

}
