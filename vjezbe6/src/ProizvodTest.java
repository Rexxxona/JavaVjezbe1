import java.util.ArrayList;
import java.time.LocalDate;

public class ProizvodTest {

	public static void main(String[] args) {
		Garderoba g1 = new Garderoba("majca","23231312","Crna Gora",2026,2.5,"Kasmir","zimska");
		HemijskiProizvodi h1 = new HemijskiProizvodi("prasak","12313123231","Amerika",2026,9.5,23.4f,true);
		Hrana h2 = new Hrana("pica","3123123312","Italija",2026,11,600,LocalDate.of(2026, 10, 22));
		
		ArrayList <Proizvod>lista = new ArrayList<>();
		lista.add(g1);
		lista.add(h1);
		lista.add(h2);
		
		for(Proizvod p:lista) {
			System.out.println(p);
		}
		
		
		for(Proizvod p:lista) {
			p.izracunajCijenu();
		}
		
		System.out.println("================ Nakon izracunavanja cijena ================");
		for(Proizvod p : lista) {
		    System.out.println(p);
		}
		
		

	}

}
