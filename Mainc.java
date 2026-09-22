import java.util.Scanner;

public class Mainc
{
    public static void main(String[] args)
    {
        Scanner be = new Scanner(System.in);

        System.out.print("Add meg a kör sugarának hosszát: ");
        double sugar = be.nextDouble();

        Circle circle = new Circle(sugar);

        System.out.println("A kör kerülete: " + circle.kerulet());
        System.out.println("A kör területe: " + circle.terulet());
    }
}