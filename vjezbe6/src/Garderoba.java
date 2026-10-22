
public class Garderoba extends Proizvod {
	
	private String materijalProizvodnje;
	private String sezona;
	

	public Garderoba(String opisProizvoda, String barkod, String zemljaPorijekla, int godinaProizvodnje, double uvoznaCijena, String materijalProizvodnje, String sezona) {
		super(opisProizvoda, barkod, zemljaPorijekla, godinaProizvodnje, uvoznaCijena);
		
		this.materijalProizvodnje = materijalProizvodnje;
		this.sezona = sezona;
	}
	

	// Geteri i seteri
	public String getMaterijalProizvoda() {
		return materijalProizvodnje;
	}

	public void setMaterijalProizvoda(String materijalProizvoda) {
		this.materijalProizvodnje = materijalProizvoda;
	}

	public String getSezona() {
		return sezona;
	}

	public void setSezona(String sezona) {
		this.sezona = sezona;
	}
	
	public void izracunajCijenu () {
		this.setUvoznaCijena(this.getUvoznaCijena()*1.05);
		//this.uvoznaCijena = this.getUvoznaCijena()*1.05;
	}
	
	


	@Override
	public String toString() {
		return "Garderoba [materijalProizvodnje=" + materijalProizvodnje + ", sezona=" + sezona
				+ ", getMaterijalProizvoda()=" + getMaterijalProizvoda() + ", getSezona()=" + getSezona()
				+ ", getOpisProizvoda()=" + getOpisProizvoda() + ", getBarkod()=" + getBarkod()
				+ ", getZemljaPorijekla()=" + getZemljaPorijekla() + ", getGodinaProizvodnje()="
				+ getGodinaProizvodnje() + ", getUvoznaCijena()=" + getUvoznaCijena() + "]";
	}


	public static void main(String[] args) {
		

	}

}
