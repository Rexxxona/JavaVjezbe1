import java.util.ArrayList;

public class TestnaKlasa {

    public static ArrayList<Destinacija> filtriraj(ArrayList<Destinacija> destinacije) {
        ArrayList<Destinacija> novaLista = new ArrayList<Destinacija>();

        for (Destinacija d : destinacije) {
            if (d.getOcjena() > 8 && d.getUdaljenostKm() < 1000) {
                novaLista.add(d);
            }
        }
        return novaLista;
    }

    public static Destinacija najvisePosjeta(ArrayList<Destinacija> destinacije) {
        Destinacija max = destinacije.get(0);
        for (int i = 1; i < destinacije.size(); i++) {
            if (destinacije.get(i).getBrojPosjeta() > max.getBrojPosjeta()) {
                max = destinacije.get(i);
            }
        }
        return max;
    }

    public static void sortiraj(ArrayList<Destinacija> destinacije) {
        for (int i = 0; i < destinacije.size() - 1; i++) {
            for (int j = 0; j < destinacije.size() - i - 1; j++) {
                if (destinacije.get(j).getOcjena() < destinacije.get(j + 1).getOcjena()) {
                    Destinacija temp = destinacije.get(j);
                    destinacije.set(j, destinacije.get(j + 1));
                    destinacije.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Destinacija> destinacije = new ArrayList<Destinacija>();

        Destinacija d1 = new Destinacija("Barcelona", "Spanija", 10, 2500, 20000000);
        Destinacija d2 = new Destinacija("Pariz", "Francuska", 9, 1800, 200001000);
        Destinacija d3 = new Destinacija();
        d3.setNaziv("Rim");
        d3.setDrzava("Italija");
        d3.setOcjena(9);
        d3.setUdaljenostKm(800);
        d3.setBrojPosjeta(100000);

        destinacije.add(d1);
        destinacije.add(d2);
        destinacije.add(d3);

        // a
        ArrayList<Destinacija> f = filtriraj(destinacije);
        for (Destinacija d : f) {
            System.out.println(d.getNaziv() + " " + d.getOcjena() + " " + d.getUdaljenostKm());
        }

        // b
        Destinacija top = najvisePosjeta(destinacije);
        System.out.println("Najvise posjeta: " + top.getNaziv());

        // c
        sortiraj(destinacije);
        for (Destinacija d : destinacije) {
            System.out.println(d.getNaziv() + ": " + d.getOcjena());
        }
    }
}