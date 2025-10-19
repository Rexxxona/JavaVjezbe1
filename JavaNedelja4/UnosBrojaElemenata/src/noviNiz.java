import java.util.Scanner;
import java.util.Random;
public class noviNiz {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		Scanner unos = new Scanner(System.in);
		// Unos niza
		System.out.print("Unesite duzinu niza: ");
		int duzina = unos.nextInt();
		
		int[] niz = new int[duzina];
		for(int i = 0; i < duzina; i++) {
			niz[i] = rand.nextInt(100); // Popunjavanje niza nasumicnim brojevima od 0 do 99
			
		}
		
	}

}
