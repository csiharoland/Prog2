public class gomb
{
    public double sugar;

    public gomb(double sugar)
    {
        this.sugar = sugar;
    }

    public double felszin()
    {
        return 4 * Math.PI * sugar * sugar;
    }

    public double terfogat()
    {
        return (4.0 / 3.0) * Math.PI * sugar * sugar * sugar;
    }
}