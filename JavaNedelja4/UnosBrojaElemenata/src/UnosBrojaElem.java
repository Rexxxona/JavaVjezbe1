import java.util.Scanner;
public class UnosBrojaElem {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite duzinu niza: ");
		int duzina = unos.nextInt();
		int[] niz = new int[duzina];
		int suma = 0;
		int najmanji = Integer.MAX_VALUE;
		for (int i = 0; i < duzina; i++) {
			System.out.print("Unesite element na poziciji " + i + ": ");
			niz[i] = unos.nextInt();
			suma += niz[i];
			if (niz[i] < najmanji) {
				najmanji = niz[i];
			}
		}
		
		System.out.println("Uneseni elementi niza su:");
		for (int i = 0; i < duzina; i++) {
			System.out.print(niz[i] + " ");
		}
		
		System.out.println();
		if (duzina > 0) {
			double prosjek = (double)suma / duzina;
			System.out.println("Prosjecan broj elemenata niza je: " + prosjek);
			System.out.println("Najmanji element niza je: " + najmanji);
		} else {
			System.out.println("Niz nema elemenata.");
		}
		unos.close();
	}

}