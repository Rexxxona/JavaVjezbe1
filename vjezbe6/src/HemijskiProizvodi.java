
public class HemijskiProizvodi extends Proizvod {
	private float temperaturaSkladistenja;
	private boolean zapaljivo;
	
	
	// Konstruktor
	public HemijskiProizvodi(String opisProizvoda, String barkod, String zemljaPorijekla, int godinaProizvodnje, double uvoznaCijena, float temperaturaSkladistenja, boolean zapaljivo) {
		super(opisProizvoda, barkod, zemljaPorijekla, godinaProizvodnje, uvoznaCijena);
		this.temperaturaSkladistenja = temperaturaSkladistenja;
		this.zapaljivo = zapaljivo;
	}
	
	// Geteri i seteri
	public float getTemperaturaSkladistenja() {
		return temperaturaSkladistenja;
	}


	public void setTemperaturaSkladistenja(float temperaturaSkladistenja) {
		this.temperaturaSkladistenja = temperaturaSkladistenja;
	}


	public boolean isZapaljivo() {
		return zapaljivo;
	}


	public void setZapaljivo(boolean zapaljivo) {
		this.zapaljivo = zapaljivo;
	}

	public void izracunajCijenu() {
		
		if(this.zapaljivo) {
			this.setUvoznaCijena(getUvoznaCijena()*1.125);
		}
		else {
			this.setUvoznaCijena(getUvoznaCijena()*1.10);
		}
	}
	
	
	@Override
	public String toString() {
		return "HemijskiProizvodi [temperaturaSkladistenja=" + temperaturaSkladistenja + ", zapaljivo=" + zapaljivo
				+ ", getTemperaturaSkladistenja()=" + getTemperaturaSkladistenja() + ", isZapaljivo()=" + isZapaljivo()
				+ ", getOpisProizvoda()=" + getOpisProizvoda() + ", getBarkod()=" + getBarkod()
				+ ", getZemljaPorijekla()=" + getZemljaPorijekla() + ", getGodinaProizvodnje()="
				+ getGodinaProizvodnje() + ", getUvoznaCijena()=" + getUvoznaCijena() + "]";
	}

	public static void main(String[] args) {
		

	}

}
