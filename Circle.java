public class Circle
{
    private double sugar;

    public Circle(double sugar)
    {
        this.sugar = sugar;
    }

    public double kerulet()
    {
        return 2 * Math.PI * sugar;
    }

    public double terulet()
    {
        return Math.PI * sugar * sugar;
    }
}