import java.util.Scanner;
public class Trkaci_kruzna_staza {

	public static void main(String[] args) {

		int R1, R2, N, xi, yi, cx, cy, naStazi = 0;
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesi broj trkaca N: \n");
		N = unos.nextInt();
		
		System.out.print("Unesi R1\n");
		R1 = unos.nextInt();
		
		System.out.print("Unesi R2\n");
		R2 = unos.nextInt();
		
		System.out.print("Unesi koordinate centra: \n");
		cx = unos.nextInt();
		cy = unos.nextInt();
		
		
		
		for(int i=0; i<N; i++) {
			System.out.print("Unesi koordinate trkaca (x, y): \n");
			xi = unos.nextInt();
			yi = unos.nextInt();
			
			double ER = Math.sqrt(Math.pow((yi - cy), 2) + Math.pow((xi - cx), 2));
			
			if (ER >= R1 && ER <= R2 && yi > cy) {
				
				naStazi++;
				
			}
			
		}
		System.out.printf("Broj trkaca na stazi je: \n", naStazi);
		
	}

}
