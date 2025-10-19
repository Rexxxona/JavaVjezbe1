package treci_cas;
import java.util.Scanner;

public class Zakopano_blago {

	public static void main(String[] args) {
		
		double B, uD, xH, xK, xB, yK, yH, yB;
		
		Scanner unos = new Scanner(System.in);
		
		xH = unos.nextDouble();
		yH = unos.nextDouble();
		xK = unos.nextDouble();
		yK = unos.nextDouble();
		xB = xK + 2;
		yB = yK - 3;
		
		System.out.printf("Koordinate blaga su %.2f, %.2f\n", xB, yB);
		
		
		
		uD = Math.sqrt(Math.pow((yB-yH), 2) + Math.pow((xB-xH), 2));
		double uDH = Math.sqrt(Math.pow((yB-yK), 2) + Math.pow((xB-xK), 2));
		double uKD = uD + uDH;
		
		System.out.printf("Vasdusno rastojanje izmedju blaga i hrasta je %.2f\n", uD);
		System.out.printf("Vasdusno rastojanje izmedju blaga i kuce je je %.2f\n", uDH);
		System.out.printf("Udaljenost od hrasta do blaga PREKO KUCE je: %.2f", uKD);
		
		
	}

}
