public class InverseCaptcha {

    public static int calculateCaptcha(String sequence) {
        if (sequence == null || sequence.isEmpty()) {
            return 0;
        }

        int sum = 0;
        int length = sequence.length();

        for (int i = 0; i < length; i++) {
            char currentDigit = sequence.charAt(i);
            // A modulo (%) operátorral biztosítjuk a cirkuláris működést.
            // Amikor i az utolsó index, (i + 1) % length értéke 0 lesz (vagyis az első elem).
            char nextDigit = sequence.charAt((i + 1) % length);

            if (currentDigit == nextDigit) {
                // A karaktert számértékké alakítjuk és hozzáadjuk az összeghez
                sum += Character.getNumericValue(currentDigit);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        // Ellenőrizzük, hogy a futtatáskor megadták-e a számsorozatot argumentumként
        if (args.length == 0) {
            System.out.println("Hiba: Kerlek add meg a számsorozatot argumentumkent!");
            System.out.println("Használat: java InverseCaptcha <szamsorozat>");
            return;
        }

        String sequence = args[0];
        
        // Opcionális: Ellenőrizhetjük, hogy a bemenet csak számjegyeket tartalmaz-e
        if (!sequence.matches("\\d+")) {
            System.out.println("Hiba: A bemenet csak szamjegyeket tartalmazhat!");
            return;
        }

        int result = calculateCaptcha(sequence);
        System.out.println("Az eredmeny: " + result);
    }
}