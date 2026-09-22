public class sztring
{
    // A. donuts
    static String donuts(int n)
    {
        if (n >= 10) {
            return "Fánkok száma: sok";
        }
        return "Fánkok száma: " + n;
    }

    // B. both_ends
    static String bothEnds(String s)
    {
        if (s.length() < 2) {
            return "";
        }
        return s.substring(0, 2) + s.substring(s.length() - 2);
    }

    // C. fix_start
    static String fixStart(String s)
    {
        char first = s.charAt(0);
        String rest = s.substring(1).replace(first, '*');
        return first + rest;
    }

    // D. mixUp
    static String mixUp(String a, String b)
    {
        String newA = b.substring(0, 2) + a.substring(2);
        String newB = a.substring(0, 2) + b.substring(2);
        return newA + " " + newB;
    }

    static void test(String got, String expected)
    {
        String prefix = (got.equals(expected) ? " OK " : "  X ");
        System.out.printf("%s got: %s; expected: %s\n", prefix, got, expected);
    }

    public static void main(String[] args)
    {
        test(donuts(4), "Fánkok száma: 4");
        test(donuts(9), "Fánkok száma: 9");
        test(donuts(10), "Fánkok száma: sok");
        test(donuts(99), "Fánkok száma: sok");
        System.out.println("#");
        test(bothEnds("spring"), "spng");
        test(bothEnds("Hello"), "Helo");
        test(bothEnds("a"), "");
        test(bothEnds("xyz"), "xyyz");
        System.out.println("#");
        test(fixStart("babble"), "ba**le");
        test(fixStart("aardvark"), "a*rdv*rk");
        test(fixStart("google"), "goo*le");
        test(fixStart("donut"), "donut");
        System.out.println("#");
        test(mixUp("mix", "pod"), "pox mid");
        test(mixUp("dog", "dinner"), "dig donner");
        test(mixUp("gnash", "sport"), "spash gnort");
        test(mixUp("pezzy", "firm"), "fizzy perm");
    }
}