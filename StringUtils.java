public class StringUtils {

    /**
     * Eldönti, hogy a megadott szó palindróm-e
     * (visszafelé olvasva ugyanaz-e, mint előre).
     */
    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
