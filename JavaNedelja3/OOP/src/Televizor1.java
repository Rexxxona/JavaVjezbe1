
public class Televizor1 {
	
	private int brojKanala;
	private String nazivKanala;
	private int jacinaTona;
	
	public Televizor1 (int brojKanala, String nazivKanala, int jacinaTona) {
		setBrojKanala(brojKanala);
		setNazivKanala(nazivKanala);
		setJacinaTona(jacinaTona);
	}
	
	public int getBrojKanala() {
		return brojKanala;
	}
	
	public void setBrojKanala(int brojKanala) {
		if (brojKanala >= 1) {
			this.brojKanala = brojKanala;
		} else {
			this.brojKanala = 1;
		}
	}
	
	public String getNazivKanala() {
		return nazivKanala;
	}
	
	public void setNazivKanala(String nazivKanala) {
		this.nazivKanala = nazivKanala;
	}
	
	public int getJacinaTona() {
		return jacinaTona;
	}
	
	public void setJacinaTona (int jacinaTona) {
		if (jacinaTona >= 0 && jacinaTona <= 10) {
			this.jacinaTona = jacinaTona;
		} else if (jacinaTona < 0){
			this.jacinaTona = 0;
		} else {
			this.jacinaTona = 10;
		}
	}
	
	public void pojacajTon() {
		if (jacinaTona < 10) {
			jacinaTona++;
		}
	}
	
	public void ispisi() {
		System.out.println("Broj kanala: " + brojKanala);
		System.out.println("Naziv kanala: " + nazivKanala);
		System.out.println("Jacina tona: " + jacinaTona);
	}


	public static void main(String[] args) {
		Televizor1 tv = new Televizor1(5, "HBO", 7);
		tv.ispisi();
		tv.pojacajTon();

	}

}
