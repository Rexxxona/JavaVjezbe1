import java.time.LocalDate;

public class Hrana extends Proizvod {
	private int brojKalorija;
	private LocalDate rokUpotrebe;
	
	public Hrana(String opisProizvoda, String barkod, String zemljaPorijekla, int godinaProizvodnje, double uvoznaCijena, int brojKalorija, LocalDate rokUpotrebe) {
		super(opisProizvoda, barkod, zemljaPorijekla, godinaProizvodnje, uvoznaCijena);
		this.setBrojKalorija(brojKalorija);
		this.setRokUpotrebe(rokUpotrebe);
	}
	
	public int getBrojKalorija() {
		return brojKalorija;
	}

	public void setBrojKalorija(int brojKalorija) {
		if(brojKalorija > 0)
		this.brojKalorija = brojKalorija;
	}

	public LocalDate getRokUpotrebe() {
		return rokUpotrebe;
	}

	public void setRokUpotrebe(LocalDate rokUpotrebe) {
		this.rokUpotrebe = rokUpotrebe;
	}
	
	/* public void izracunajCijenu() {
		LocalDate danas = LocalDate.now();
		if(danas.minusMonths(6).isAfter(rokUpotrebe)) {
			this.setUvoznaCijena(getUvoznaCijena()*1.1);
		}
		else {
			this.setUvoznaCijena(getUvoznaCijena()*1.05);
		}
	} */
	
	public void izracunajCijenu() {
		if(rokUpotrebe.isBefore(LocalDate.now().plusMonths(6))) {
			this.setUvoznaCijena(getUvoznaCijena()*1.05);
		}
		else {
			this.setUvoznaCijena(getUvoznaCijena()*1.1);
		}
	}
	
	


	@Override
	public String toString() {
		return "Hrana [brojKalorija=" + brojKalorija + ", rokUpotrebe=" + rokUpotrebe + ", getBrojKalorija()="
				+ getBrojKalorija() + ", getRokUpotrebe()=" + getRokUpotrebe() + ", getOpisProizvoda()="
				+ getOpisProizvoda() + ", getBarkod()=" + getBarkod() + ", getZemljaPorijekla()=" + getZemljaPorijekla()
				+ ", getGodinaProizvodnje()=" + getGodinaProizvodnje() + ", getUvoznaCijena()=" + getUvoznaCijena()
				+ "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
