public class Poboljsana_for_petlja {
	public static void main(String[] args) {
		double[] niz = {3.1, 4.5, 7.12, 4.55, 2.1, 6, 11.8, 4.13, 8.61};
		double sredVrijednost = 0.0;
		for(double x: niz){
			sredVrijednost += x;
			x *= 2;
}

		// Kako bi se ovo odradilo klasičnom for petljom?
		sredVrijednost /= niz.length;
		System.out.printf("Srednja vrijednost niza je %f\n",sredVrijednost);
		System.out.print("Niz je: ");
		for(double x: niz)
			System.out.printf("%.2f ",x);
}
}