import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class KompleksniTest {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner unos = new Scanner(System.in);
		
		KompleksniBroj z1 = new KompleksniBroj();
		KompleksniBroj z2 = new KompleksniBroj(-3);
		KompleksniBroj z3 , z4;
		
		z3 = z1.saberi(z2);
		System.out.printf("Nestaticka metoda: ");
		z3.odstampaj();
		
		z4 = KompleksniBroj.saberi(z1, z2);
		System.out.printf("Staticka metoda: ");
		z4.odstampaj();
		
		
		//System.out.print("Unesi broj emenata niza: ");
		//int N = unos.nextInt();
		ArrayList<KompleksniBroj> x = new ArrayList<KompleksniBroj>();
		
		Scanner ff = new Scanner(new File("C:\\Users\\DARTHMAUL\\OneDrive\\Desktop\\temp"));
		
		while(ff.hasNextLine()) {
			float r = ff.nextFloat();
			float i = ff.nextFloat();
			KompleksniBroj k = new KompleksniBroj(r, i);
			x.add(k);
		}
		
		System.out.println("Ispis elemenata niza: ");
		for(KompleksniBroj a: x) {
			a.odstampaj();
			System.out.println();
		}
		
	}
	
}