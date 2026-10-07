public class Main
{
    static String sztringTisztitasa(String s)
    {
        StringBuilder eredmeny = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isWhitespace(c)) {
                eredmeny.append(c);
            }
        }

        return eredmeny.toString();
    }

    static void test(String got, String expected)
    {
        String prefix = (got.equals(expected) ? " OK " : "  X ");
        System.out.printf("%s got: %s; expected: %s\n", prefix, got, expected);
    }

    public static void main(String[] args)
    {
        test(sztringTisztitasa("192.20.246.138:\n6666"), "192.20.246.138:6666");
        test(sztringTisztitasa("206.130.99.82:\n8080"), "206.130.99.82:8080");
        test(sztringTisztitasa("nincs benne whitespace"), "nincsbenwhitespace");
        test(sztringTisztitasa("  tabulátor\tszóköz\nújsor  "), "tabulátorszóközújsor");
    }
}
