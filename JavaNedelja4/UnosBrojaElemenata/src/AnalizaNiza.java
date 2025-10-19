static class Analiza {
    public static double nadjiParniPozitivniProsjek(int[] niz) {
        int suma = 0;
        int broj = 0;
        for (int x : niz) {
            if (x > 0 && x % 2 == 0) {
                suma += x;
                broj++;
            }
        }
        if (broj == 0) return 0;
        return (double) suma / broj;
    }
}

void main() {
    Scanner unos = new Scanner(System.in);
    // Unos niza
    IO.print("Unesite elemente niza: \n");
    int[] niz = new int[10];
    for (int i = 0; i < niz.length; i++) {
        niz[i] = unos.nextInt();
    }
    IO.println("Prosjek pozitivnih parnih brojeva: " +  Analiza.nadjiParniPozitivniProsjek(niz));
    unos.close();
}
