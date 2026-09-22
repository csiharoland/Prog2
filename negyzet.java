public class negyzet
{
    private int oldal;

    public negyzet(int oldal)
    {
        this.oldal = oldal;
    }

    public int kerulet()
    {       
        return 4 * oldal;
    }

    public int terulet()
    {
        return oldal * oldal;
    }
}