public class Main {

    public static void main(String[] args) {
        String[] gyumik={"alma","korte","szolo"};

    // System.out.println(Arrays.toString(gyumik));

    for(int i = 0; i < gyumik.length; i++)
    {
        System.out.println(gyumik[i]);
    }


    for(String elem :gyumik)
    {
        System.out.println(elem);
    }

    String[] masik = gyumik.clone();

    masik[0]="szilva";

    for(String elem : gyumik)
    {
        System.out.println(elem);
    }

    }
}
