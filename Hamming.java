public class Hamming
{
    private String s1;
    private String s2;

    public Hamming(String s1, String s2)
    {
        this.s1 = s1;
        this.s2 = s2;
    }

    public int tavolsag()
    {
        if (s1.length() != s2.length()) {
            throw new IllegalArgumentException("A két sztring hossza nem egyezik, a Hamming-távolság nem értelmezett!");
        }

        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
