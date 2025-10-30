
class Kombi extends Vozilo{
	
	private int kapacitetPutnika;
	
	public Kombi(String proizvodjac, int godinaProizvodnje, String boja, float kubikaza, int kapacitetPutnika) {
		super(proizvodjac, godinaProizvodnje, boja, kubikaza);
		this.kapacitetPutnika = kapacitetPutnika;
	}
	
	public int getKapacitetPutnika() {
		return kapacitetPutnika;
	}
	
	public void setKapacitetPutnika(int kapacitetPutnika) {
		this.kapacitetPutnika = kapacitetPutnika;
	}
	
	@Override
	public double izracunajRegistraciju() {
		double cijena = super.izracunajRegistraciju();
		if (kapacitetPutnika > 8) {
			cijena += 30;
			}
		return cijena;
	}
	
	@Override
    public void prikaziInfo() {
        super.prikaziInfo();  
        System.out.println("Kapacitet putnika: " + kapacitetPutnika);
    }

}
