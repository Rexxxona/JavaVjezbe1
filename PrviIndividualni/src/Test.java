
public class Test {
	
	public static void main(String[] args) {
		
		Automobil auto = new Automobil("Toyota", 2000, "Crvena", 2200f, "4", "Dizel");
		Kamion kamion = new Kamion("Volvo", 2005, "Plava", 5000f, 20000f, true);
		Kombi kombi = new Kombi("Ford", 2018, "Bijela", 2500f, 12);
		
		System.out.println("Informacije o automobilu:");
		auto.prikaziInfo();
		System.out.println("Cijena registracije: " + auto.izracunajRegistraciju() + "EUR");
		System.out.println();
		
		System.out.println("Informacije o kamionu:");
		kamion.prikaziInfo();
		System.out.println("Cijena registracije: " + kamion.izracunajRegistraciju() + "EUR");
		System.out.println();
		
		System.out.println("Informacije o kombiju:");
		kombi.prikaziInfo();
		System.out.println("Cijena registracije: " + kombi.izracunajRegistraciju() + "EUR");

	}

}
