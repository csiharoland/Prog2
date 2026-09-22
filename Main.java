import java.util.Scanner;

public class Mainn
{
    public static void main(String[] args)
    {
        Scanner be = new Scanner(System.in);

        System.out.print("Add meg a négyzet oldalának hosszát: ");
        int oldal = be.nextInt();

        negyzet negyzet = new negyzet(oldal);

        System.out.println("A négyzet kerülete: " + negyzet.kerulet());
        System.out.println("A négyzet területe: " + negyzet.terulet());
    }
}