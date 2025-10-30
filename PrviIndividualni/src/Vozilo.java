public class Vozilo {
	
	private String proizvodjac;
	private int godinaProizvodnje;
	private String boja;
	private float kubikaza;
	
	public Vozilo(String proizvodjac, int godinaProizvodnje, String boja, float kubikaza) {
		super();
		this.proizvodjac = proizvodjac;
		this.godinaProizvodnje = godinaProizvodnje;
		this.boja = boja;
		this.kubikaza = kubikaza;
	}

	public String getProizvodjac() {
		return proizvodjac;
	}

	public void setProizvodjac(String proizvodjac) {
		this.proizvodjac = proizvodjac;
	}

	public int getGodinaProizvodnje() {
		return godinaProizvodnje;
	}

	public void setGodinaProizvodnje(int godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}

	public float getKubikaza() {
		return kubikaza;
	}

	public void setKubikaza(float kubikaza) {
		this.kubikaza = kubikaza;
	}
	
	
	public double izracunajRegistraciju() {
		double cijena = 100;
		if (godinaProizvodnje < 2010) {
			cijena += 30;
		}
		if (kubikaza > 2000) {
				cijena +=50;
		}
		return cijena;
	}
	
	public void prikaziInfo() {
		System.out.println("Proizvodjac: " + proizvodjac);
		System.out.println("Godina proizvodnje: " + godinaProizvodnje);
		System.out.println("Boja: " + boja);
		System.out.println("Kubikaza: " + kubikaza);	
    }

}