//elso
// class Proba
// {
//     public string cim; //Attributum
    
//     public Proba(string cim)
//     {
//         this.cim = cim;
//     }


// }
// public class main 
// {
//     public static void main(String[] args)
//     {
//     System.out.println("Hello world");
//     }

//     Proba p1 = new Proba("Dune");
    
// }

// 2.

class Movie
{
    public String title;
    public int year;
    public double score;

    public void setScore(double score) {
        this.score = score;
    if(score < 0.0)
    {
        score =0.0;
    }
    if(score > 10.0)
    {
        score=10.0;
    }
}
//Konstruktor
    public Movie(String title, int year, double score){

        this.title = title;
        this.year =year;
        this.score =score;
    }

     @Override
     public String toString()
        {
         return String.format("%s;.1f(%d)",this.title, this.score, this.year);
        }

}

public class main 
{
    public static void main(String[] args)
    {
    Movie m1 = new Movie("Pokember",2026,8.0);

    }
}
    