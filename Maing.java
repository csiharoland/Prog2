import java.util.Scanner;

public class Maing
{
    public static void main(String[] args)
    {
        Scanner be = new Scanner(System.in);

        System.out.print("Add meg a gömb sugarának hosszát: ");
        double sugar = be.nextDouble();

        gomb gomb = new gomb(sugar);

        System.out.println("A gömb felszíne: " + gomb.felszin());
        System.out.println("A gömb térfogata: " + gomb.terfogat());
    }
}