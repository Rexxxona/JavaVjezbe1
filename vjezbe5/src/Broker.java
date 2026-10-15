import java.util.Scanner;

public class Broker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite transakcije: ");
        String a = sc.nextLine();

        String[] transakcije = a.split(" ");
        int saldo = 0;

        for (int i = 0; i < transakcije.length; i++) {
            String t = transakcije[i];

            
            String samoBroj = "";
            for (int j = 1; j < t.length(); j++) {
                samoBroj += t.charAt(j);
            }

            
            int broj = 0;
            for (int j = 0; j < samoBroj.length(); j++) {
                broj = broj * 10 + (samoBroj.charAt(j) - '0');
            }

            
            if (t.charAt(0) == 'S') {
                saldo += broj;
            } else if (t.charAt(0) == 'B') {
                saldo -= broj;
            }
        }

        System.out.println("Izlaz: " + saldo);
    }
}