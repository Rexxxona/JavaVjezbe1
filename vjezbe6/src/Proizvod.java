public class Proizvod {
	private String opisProizvoda;
	private String barkod;
	private String zemljaPorijekla;
	private int godinaProizvodnje;
	private double uvoznaCijena;
	
	
	public Proizvod(String opisProizvoda, String barkod, String zemljaPorijekla, int godinaProizvodnje, double uvoznaCijena) {
		this.opisProizvoda = opisProizvoda;
		this.barkod = barkod;
		this.zemljaPorijekla = zemljaPorijekla;
		this.godinaProizvodnje = godinaProizvodnje;
		this.uvoznaCijena = uvoznaCijena;
	}
	
	public String getOpisProizvoda() {
		return opisProizvoda;
	}


	public void setOpisProizvoda(String opisProizvoda) {
		this.opisProizvoda = opisProizvoda;
	}


	public String getBarkod() {
		return barkod;
	}


	public void setBarkod(String barkod) {
		this.barkod = barkod;
	}


	public String getZemljaPorijekla() {
		return zemljaPorijekla;
	}


	public void setZemljaPorijekla(String zemljaPorijekla) {
		this.zemljaPorijekla = zemljaPorijekla;
	}


	public int getGodinaProizvodnje() {
		return godinaProizvodnje;
	}


	public void setGodinaProizvodnje(int godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}


	public double getUvoznaCijena() {
		return uvoznaCijena;
	}
	
	public void izracunajCijenu(){}


	public void setUvoznaCijena(double uvoznaCijena) {
		this.uvoznaCijena = uvoznaCijena;
	}
	


	public static void main(String[] args) {
		

	}

}
