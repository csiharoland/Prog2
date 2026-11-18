import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        // Példa
        String fname = "input.txt";
        List<Integer> digits = FileUtils.readFirstLineAsDigits(fname);
        System.out.println(digits);    // [4, 3, 7, 8, 5]

        // Konkrét feladat: a day01.txt számjegyeinek összege
        List<Integer> dayDigits = FileUtils.readFirstLineAsDigits("day01.txt");
        int sum = 0;
        for (int d : dayDigits) {
            sum += d;
        }
        System.out.println("Számjegyek száma: " + dayDigits.size());
        System.out.println("Számjegyek összege: " + sum);
    }
}
