public class Zaposleni {
    private String ime;
    private String prezime;
    private int staz;
    private double plata;

    public Zaposleni(String ime, String prezime, int staz, double plata) {
        this.ime = ime;
        this.prezime = prezime;
        this.staz = staz;
        this.plata = plata;
    }

    public String getIme() {
        return this.ime;
    }

    public String getPrezime() {
        return this.prezime;
    }

    public int getStaz() {
        return this.staz;
    }

    public double getPlata() {
        return this.plata;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setStaz(int staz) {
        if (staz >= 0) {
            this.staz = staz;
        } else {
            System.out.println("Greska: Staz ne moze biti manji od nule!");
        }
    }

    public void setPlata(double plata) {
        if (plata >= 0) {
            this.plata = plata;
        } else {
            System.out.println("Greska: Plata ne moze biti negativna!");
        }
    }

    public void ispisi() {
        System.out.println(ime + " " + prezime + " | Staz: " + staz + " god | Plata: " + plata + " EUR");
    }

    // povecanje 6% ako je plata < 800 i ima preko 10 god staza
    public void povecajPlatu() {
        if (this.plata < 800 && this.staz > 10) {
            this.plata = this.plata * 1.06;
            System.out.println("Plata za " + ime + " je uspjesno povecana na: " + this.plata);
        }
    }

    public static void main(String[] args) {
        Zaposleni z1 = new Zaposleni("Nikola", "Ivanovic", 4, 720.0);
        Zaposleni z2 = new Zaposleni("Milica", "Popovic", 12, 750.0);
        Zaposleni z3 = new Zaposleni("Stefan", "Radovic", 14, 980.0);

        z1.ispisi();
        z2.ispisi();
        z3.ispisi();

        z1.setPlata(740.0);
        System.out.println("Izmijenjena plata: " + z1.getPlata());

        z1.povecajPlatu();
        z2.povecajPlatu();
        z3.povecajPlatu();

        z1.ispisi();
        z2.ispisi();
        z3.ispisi();
    }
}