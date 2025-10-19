public static double brojPosjeta(int[] niz) {
    int max = 0;
    int broj = 0;
    for (int x : niz) {
        if (x > 0 && x > max) {
            max = x;
            broj++;
        }
    }
    if (broj == 0) return 0;
    return max;
}

void main() {
    Scanner unos = new Scanner(System.in);
    // Unos niza
    IO.print("Unesite broj posjeta po utakmici: \n");
    int[] niz = new int[10];
    for (int i = 0; i < niz.length; i++) {
        niz[i] = unos.nextInt();
    }
    IO.println("Najvise posjeta u jednom danu: " + brojPosjeta(niz));

    unos.close();
}
