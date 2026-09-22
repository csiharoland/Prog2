public class sztring2
{
    // E. verbing
    private static String verbing(String s)
    {
        if (s.length() < 3) {
            return s;
        }
        if (s.endsWith("ing")) {
            return s + "ly";
        }
        return s + "ing";
    }

    // F. not_bad
    private static String notBad(String s)
    {
        int notPos = s.indexOf("not");
        int badPos = s.indexOf("bad");
        if (notPos >= 0 && badPos > notPos) {
            return s.substring(0, notPos) + "good" + s.substring(badPos + 3);
        }
        return s;
    }

    // G. front_back
    private static String frontBack(String a, String b)
    {
        int aFrontLen = (a.length() + 1) / 2;
        int bFrontLen = (b.length() + 1) / 2;

        String aFront = a.substring(0, aFrontLen);
        String aBack = a.substring(aFrontLen);
        String bFront = b.substring(0, bFrontLen);
        String bBack = b.substring(bFrontLen);

        return aFront + bFront + aBack + bBack;
    }

    static void test(String got, String expected)
    {
        String prefix = (got.equals(expected) ? " OK " : "  X ");
        System.out.printf("%s got: %s; expected: %s\n", prefix, got, expected);
    }

    public static void main(String[] args)
    {
        System.out.println("verbing");
        test(verbing("hail"), "hailing");
        test(verbing("swiming"), "swimingly");
        test(verbing("do"), "do");

        System.out.println();
        System.out.println("not_bad");
        test(notBad("This movie is not so bad"), "This movie is good");
        test(notBad("This dinner is not that bad!"), "This dinner is good!");
        test(notBad("This tea is not hot"), "This tea is not hot");
        test(notBad("It's bad yet not"), "It's bad yet not");

        System.out.println();
        System.out.println("front_back");
        test(frontBack("abcd", "xy"), "abxcdy");
        test(frontBack("abcde", "xyz"), "abcxydez");
        test(frontBack("Kitten", "Donut"), "KitDontenut");
    }
}