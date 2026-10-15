public class Destinacija {
    private String naziv;
    private String drzava;
    private int ocjena;
    private int udaljenostKm;
    private long brojPosjeta;

    public Destinacija(String naziv, String drzava, int ocjena, int udaljenostKm, long brojPosjeta) {
        this.naziv = naziv;
        this.drzava = drzava;
        this.ocjena = ocjena;
        this.udaljenostKm = udaljenostKm;
        this.brojPosjeta = brojPosjeta;
    }

    public Destinacija() {
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public int getOcjena() {
        return ocjena;
    }

    public void setOcjena(int ocjena) {
        if (ocjena >= 0 && ocjena <= 10) {
            this.ocjena = ocjena;
        }
    }

    public int getUdaljenostKm() {
        return udaljenostKm;
    }

    public void setUdaljenostKm(int udaljenostKm) {
        this.udaljenostKm = udaljenostKm;
    }

    public long getBrojPosjeta() {
        return brojPosjeta;
    }

    public void setBrojPosjeta(long brojPosjeta) {
        this.brojPosjeta = brojPosjeta;
    }
}