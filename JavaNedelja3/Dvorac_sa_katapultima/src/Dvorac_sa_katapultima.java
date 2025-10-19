import java.util.Scanner;
public class Dvorac_sa_katapultima {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesi broj katapulta N \n");
		int N = unos.nextInt();
		
		System.out.print("Unesi maksimalno rastojanje D \n");
		int D = unos.nextInt();
		
		System.out.print("Unesi health dvorca HD \n");
		int HD = unos.nextInt();
		
		System.out.print("Unesi vrijednost napada katapulta KD \n");
		int KD = unos.nextInt();
		
		int x, y;
		
		int broj_prijetecih = 0;
		
		for (int i = 0; i < N; i++) {
			System.out.print("Unesi koordinate katapulta" + (i + 1) + "(x, y)");
			x = unos.nextInt();
			y = unos.nextInt();
			
			int rastojanje = Math.abs(x) + Math.abs(y);
			
			if (rastojanje <= D) {
				broj_prijetecih++;
			}
		
		}
		
		System.out.println("Broj katapulta koji predstavljaju prijenju je: " + broj_prijetecih);
		
		int UkupnaSteta = broj_prijetecih * KD;
		
		if (UkupnaSteta >= HD) {
			System.out.print("Dvorac ce biti srusen");
		}else 
				System.out.print("Dvorac ce prezivjeti napad");
		unos.close();
	}
	
}
