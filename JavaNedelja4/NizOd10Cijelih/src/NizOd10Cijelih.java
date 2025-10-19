
public class NizOd10Cijelih {

	public static void main(String[] args) {
		int[] niz = new int[10];
		for(int i = 0; i < niz.length; i++) {
			niz[i] = i;
			System.out.println(i);
		}
		
		for (int i = 9; i > 0; i--) {
			System.out.println("Element na indexu " + i + " je: " + niz[i]);
		}
	}

}
