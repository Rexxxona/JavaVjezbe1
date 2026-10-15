import java.util.Scanner;

public class brojRijeci {

    public static int brojRijeci(String s) {
        String rijeci[] = s.split(" ");
        return rijeci.length;
    }

    public static boolean daLiJePalindrom(String s) {
        // ako imamo spaces u stringu, uklanjamo ih sa replace
        String cistTekst = s.replace(" ", "").toLowerCase();
        
        StringBuilder sb = new StringBuilder(cistTekst);
        String obrnuti = sb.reverse().toString();

        return cistTekst.equals(obrnuti);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite recenicu: ");
        String recenica = sc.nextLine().trim();

        // System.out.println("Broj rijeci: " + brojRijeci(recenica));

        // dodatak: provjera palindroma
        if (daLiJePalindrom(recenica)) {
            System.out.println("Tekst jeste palindrom.");
        } else {
            System.out.println("Tekst nije palindrom.");
        }
    }
}