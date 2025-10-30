
class Kamion extends Vozilo{
	
	private float kapacitetTereta;
	private boolean prikolica;
	
	public Kamion(String proizvodjac, int godinaProizvodnje, String boja, float kubikaza, float kapacitetTereta,
			boolean prikolica) {
		super(proizvodjac, godinaProizvodnje, boja, kubikaza);
		this.kapacitetTereta = kapacitetTereta;
		this.prikolica = prikolica;
	}
	
	public float getKapacitetTereta() {
		return kapacitetTereta;
	}
	
	public void setKapacitetTereta(float kapacitetTereta) {
		this.kapacitetTereta = kapacitetTereta;
	}
	
	public boolean isPrikolica() {
		return prikolica;
	}
	
	public void setPrikolica(boolean prikolica) {
		this.prikolica = prikolica;
	}
	
	@Override
	public double izracunajRegistraciju() {
		double cijena = super.izracunajRegistraciju();
		if (prikolica) {
			cijena += 50;
		}
		return cijena;
	}
	
	@Override
	public void prikaziInfo() {
		super.prikaziInfo();  
		System.out.println("Kapacitet tereta: " + kapacitetTereta);
		System.out.println("Prikolica: " + (prikolica ? "Da" : "Ne"));
	}
	
}
