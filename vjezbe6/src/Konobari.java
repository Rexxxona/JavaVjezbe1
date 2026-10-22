
public class Konobari extends Zaposleni {
	

	public Konobari(int id, String ime, String prezime, double plataPoSatu, int ukupanBrojSati) {
		super(id, ime, prezime, plataPoSatu, ukupanBrojSati);
	}
	
    @Override
    public double izracunajPlatu() {
        int redovniSati = getUkupanBrojSati();
        int prekovremeniSati = 0;
        if (getUkupanBrojSati() > 40) {
            redovniSati = 40;
            prekovremeniSati = getUkupanBrojSati() - 40;
        }
        double sedmicnaZarada = (redovniSati * getPlataPoSatu()) + (prekovremeniSati * getPlataPoSatu() * 1.20);
        return 4 * sedmicnaZarada;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
