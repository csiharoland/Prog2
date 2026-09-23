import java.util.Scanner;

public class teglalap {

    static class TeglalapAdat {
        private int a;
        private int b;

        public TeglalapAdat(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int kerulet() {
            return 2 * (this.a + this.b);
        }

        public int terulet() {
            return this.a * this.b;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérem, adja meg a téglalap 'a' oldalának hosszát (egész szám): ");
        int a = scanner.nextInt();

        System.out.print("Kérem, adja meg a téglalap 'b' oldalának hosszát (egész szám): ");
        int b = scanner.nextInt();

        TeglalapAdat t = new TeglalapAdat(a, b);

        int k = t.kerulet();
        int ter = t.terulet();

        System.out.println("A téglalap kerülete: " + k);
        System.out.println("A téglalap területe: " + ter);

        scanner.close();
    }
}