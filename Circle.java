public class Circle
{
    private double sugar;

    public Circle(double sugar)
    {
        this.sugar = sugar;
    }

    public double getSugar() {
        return sugar;
    }

    public double kerulet()
    {
        return 2 * Math.PI * sugar;
    }

    public double terulet()
    {
        return Math.PI * sugar * sugar;
    }
        @Override
    public String toString() {
        return "" + this.sugar;
    }
    
}
public class Main
{
    public static

}
