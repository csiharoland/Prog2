import java.util.Scanner;


class Negyzet {
    private int oldal;


    public Negyzet(int oldal) {
        this.oldal = oldal;
    }


    public int kerulet() {
        return 4 * this.oldal;
    }


    public int terulet() {
        return this.oldal * this.oldal;
    }
}

public class negyzet2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérem, adja meg a négyzet oldalának hosszát (egész szám): ");
        int a = scanner.nextInt();

        Negyzet negyzet = new Negyzet(a);

        int k = negyzet.kerulet();
        int t = negyzet.terulet();

        System.out.println("A négyzet kerülete: " + k);
        System.out.println("A négyzet területe: " + t);

        scanner.close();
    }
}