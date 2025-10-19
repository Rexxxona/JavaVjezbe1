import java.util.Scanner;
public class Drugi_zadatak {

	public static void main(String[] args) {
	
		int x;
		double rezultat;
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite x: ");
		
		x = unos.nextInt();
		
		if(x < 1) 
			rezultat = x * x;
		else
			if (1 <= x && x < 5)
				rezultat = 2 - x;
			else
				rezultat = (float)(x * x * x - 1) / 5;
		
		System.out.printf("rezultat(%d)=%2.f", x, rezultat);
		
		unos.close();
	}
}
