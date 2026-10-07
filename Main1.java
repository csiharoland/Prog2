import java.util.Scanner;

public class Main1
{
    public static void main(String[] args)
    {
        Scanner be = new Scanner(System.in);

        System.out.print("Add meg az első sztringet: ");
        String s1 = be.nextLine();

        System.out.print("Add meg a második sztringet: ");
        String s2 = be.nextLine();

        Hamming hamming = new Hamming(s1, s2);

        try {
            int tav = hamming.tavolsag();
            System.out.println("A két sztring Hamming-távolsága: " + tav);
        } catch (IllegalArgumentException e) {
            System.out.println("Hiba: " + e.getMessage());
        }
    }
}
