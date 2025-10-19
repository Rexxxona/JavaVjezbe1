import java.util.Scanner;
public class SortiranjeNiza {
	
	
	public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
	
	
	public static void main(String[] args) {

	Scanner unos = new Scanner(System.in);
	// Unos niza
	System.out.print("Unesite duzinu niza: \n");
	int duzina = unos.nextInt();
	int[] niz = new int[duzina];
	
	
	
	System.out.print("Unesite elemente niza: \n");
	for (int i = 0; i < niz.length; i++) {
		niz[i] = unos.nextInt();
	}
	
	System.out.println("Unesi broj za provjeru: ");
	int broj = unos.nextInt();
	boolean postoji = false;
	for (int i = 0; i < niz.length; i++) {
		if (niz[i] == broj) {
			postoji = true;
			break;
		}
	}
	if (postoji) {
		System.out.println("Broj se nalazi u nizu.");
	} else {
		System.out.println("Broj se ne nalazi u nizu.");
	}

	bubbleSort(niz);
	System.out.print("Sortirani niz: ");
	for (int i = 0; i < niz.length; i++) {
		System.out.print(niz[i] + " ");
	}
	System.out.println();
	unos.close();
	
	}
}