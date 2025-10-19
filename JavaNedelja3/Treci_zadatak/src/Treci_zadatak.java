import java.util.Scanner;

public class Treci_zadatak {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite x: ");
		
		int x, i; 
		long p = 1;
		
		x = unos.nextInt();
		
		for(i=1; i <= x; i++)
			p *= i;
		System.out.printf("%d faktorijal je: %d", x, p);
		
	}

}
