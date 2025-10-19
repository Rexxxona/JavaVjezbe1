import java.util.Scanner;
public class Prvi_zadatak {
	
	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		int broj;
		System.out.print("Unesite broj: ");
		broj = unos.nextInt();
		if (broj <= 0) 
			broj = -broj;
			System.out.printf("Absolutna vrijedntost je: %d.", broj);
	}
}
