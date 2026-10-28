public class StringUtils {
    // minden betűt véletlenszerűen kis- vagy nagybetűssé alakít
    public static String randomCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Math.random() < 0.5) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }
}
