import java.nio.file.Files;
import java.nio.file.Path;

public class V2 {
    static int readN() throws Exception {
        String line = Files.readAllLines(Path.of("config.txt")).get(0);
        return Integer.parseInt(line.trim().replace("_", ""));
    }

    public static void main(String[] args) throws Exception {
        int n = readN();
        long start = System.nanoTime();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(i);
        }
        String s = sb.toString();

        long end = System.nanoTime();
        System.out.println("N = " + n);
        System.out.println("Hossz: " + s.length());
        System.out.printf("Futási idő: %.3f s%n", (end - start) / 1e9);
    }
}
