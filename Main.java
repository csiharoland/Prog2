import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        // A) rész tesztelése
        System.out.println("apa: " + StringUtils.isPalindrome("apa"));       // true
        System.out.println("level: " + StringUtils.isPalindrome("level"));   // true
        System.out.println("alma: " + StringUtils.isPalindrome("alma"));     // false

        // B) rész: palindróm szavak megszámolása
        int count = 0;
        try (BufferedReader br = Files.newBufferedReader(Path.of("words_alpha.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String word = line.trim();   // a file Windows-os (\r\n) sorvégeket használ
                if (!word.isEmpty() && StringUtils.isPalindrome(word)) {
                    count++;
                }
            }
        }
        System.out.println("Palindróm szavak száma: " + count);

        // Extra: az eredmény palindróm-e?
        boolean extra = StringUtils.isPalindrome(String.valueOf(count));
        System.out.println("Az eredmény palindróm? " + extra);
    }
}
