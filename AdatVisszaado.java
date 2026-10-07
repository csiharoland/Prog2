
import java.util.ArrayList;
import java.util.List;

public class AdatVisszaado {

    // =======================================================
    // A) Több AZONOS típusú elem visszaadása:
    //    Tömböt (int[]) vagy Listát (List<T>) használunk.
    // =======================================================
    
    // Példa 1: Tömbbel (fix méret esetén)
    public static int[] getAzonosTomb(int a, int b) {
        return new int[]{a, b};
    }

    // Példa 2: Listával (dinamikus elemszám esetén)
    public static List<String> getAzonosLista() {
        List<String> nevek = new ArrayList<>();
        nevek.add("Anna");
        nevek.add("Béla");
        return nevek;
    }

    // =======================================================
    // B) Több KÜLÖNBÖZŐ típusú elem visszaadása:
    //    Egy saját osztályt hozunk létre a típusok összefogására.
    // =======================================================
    
    public static class FelhasznaloAdatok {
        public String nev;
        public int eletkor;
        public double atlag;

        public FelhasznaloAdatok(String nev, int eletkor, double atlag) {
            this.nev = nev;
            this.eletkor = eletkor;
            this.atlag = atlag;
        }
    }

    // Metódus, ami a fenti összetett típust adja vissza
    public static FelhasznaloAdatok getKulonbozoAdatok() {
        return new FelhasznaloAdatok("Kovács Péter", 21, 4.75);
    }
}