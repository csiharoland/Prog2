public class FizzBuzz {
    private final int limit;

    public FizzBuzz(int limit) {
        this.limit = limit;
    }

    public void start() {
        for (int i = 1; i <= limit; i++) {
            System.out.println(convert(i));
        }
    }

    // egy számot alakít át a szabályok szerint
    private String convert(int n) {
        if (n % 15 == 0) {      // 3-mal és 5-tel is osztható
            return "fizzbuzz";
        }
        if (n % 3 == 0) {
            return "fizz";
        }
        if (n % 5 == 0) {
            return "buzz";
        }
        return String.valueOf(n);
    }
}
