
class Automobil extends Vozilo {
	
	
	private String brojVrata;
	private String tipMotora;
	
	public Automobil(String proizvodjac, int godinaProizvodnje, String boja, float kubikaza, String brojVrata,
			String tipMotora) {
		super(proizvodjac, godinaProizvodnje, boja, kubikaza);
		this.brojVrata = brojVrata;
		this.tipMotora = tipMotora;
	}
	
	public String getBrojVrata() {
		return brojVrata;
	}
	
	public void setBrojVrata(String brojVrata) {
		this.brojVrata = brojVrata;
	}
	
	public String getTipMotora() {
		return tipMotora;
	}
	
	public void setTipMotora(String tipMotora) {
		this.tipMotora = tipMotora;
	}
	
	@Override
	public double izracunajRegistraciju() {
		double cijena = super.izracunajRegistraciju();
		System.out.println(cijena);
		if (tipMotora.equalsIgnoreCase("dizel")) {
			cijena += 20;
		}
		return cijena;
	}
	
	@Override
    public void prikaziInfo() {
        super.prikaziInfo();  
        System.out.println("Broj vrata: " + brojVrata);
        System.out.println("Tip motora: " + tipMotora);
    }

	
	
}
