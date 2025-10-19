package prvi_cas;
import java.util.Scanner;

public class While_primjer {

    public static void main(String[] args) {

        int broj, suma = 0, brojUnosa = 0;
        Scanner unos = new Scanner(System.in);

        System.out.print("Unijeti prirodne brojeve (-1 prekida unos): ");
        broj = unos.nextInt();

        while (broj != -1) {
            suma += broj;
            brojUnosa++;
            broj = unos.nextInt();
        }

        if (brojUnosa > 0) {
            double aritmSred = (double) suma / brojUnosa;
            System.out.printf("Uneseno %d brojeva.\n", brojUnosa);
            System.out.printf("Aritmeticka sredina je %.3f\n", aritmSred);
        } else {
            System.out.println("Nije unesen nijedan broj.");
        }
    }
}
