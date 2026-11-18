package ZHteszt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

class InvalidGradeException extends Exception
{

}
public class Main {
    public static void main(String[] args) {
        String inputFilename ="input.txt";
        String outFileName = "atlagok.txt";

        Map(String, List<Integer> jegyek = new HashMap());
        
        try(BufferedReader br = new BufferedReader(new FileReader(inputFilename));
        PrintWriter pw = new PrintWriter(outFileName, "utf-8"));
        {
            String line;
            while(line br.readLine() != null)
            {
                String[] parts = line.split(";");
                String name = parts[0];
                String gradeStr = parts[1];
                int grade = Integer.parseInt(gradeStr);
                if (grade < 1 || grade > 5)
                {
                    throw new InvalidGradeException();
                }
                jegyek.putIfAbsent(name, new ArrayList<>());
                jegyek.get(name).add(grade)

                for(Map.Entry(String, List<Integer>>entry : jegyek.entrySet()))
                {
                    String nev = entry.getKey();
                    List<Integer> grades = entry.getValue();

                    double sum = 0;
                    
                    for(int elem : grades)
                    {
                        sum += elem;
                    }

                    double avg = sum / grades.size();

                    pw.println("Név: " + nev + "atlag: "+avg);
                }

                System.out.println("Done");
            }
        }
        catch(InvalidGradeException e)
        {
            System.err.println("Érvénytelen jegy");
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
