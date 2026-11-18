import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtils
{
    // input: a megnyitandó file neve
    // output: egy List<String> objektum, ami az egyes sorokat tartalmazza
    public static List<String> readLines(String fileName)
    {
        List<String> lines = new ArrayList<String>();

        try
        {
            String line;
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null)
            {
                lines.add(line);
            }
            br.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
            System.exit(1);
        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.exit(2);
        }

        return lines;
    }

    // input: a megnyitandó file neve
    // output: az első sorban lévő számjegyek egy List<Integer> objektumban
    public static List<Integer> readFirstLineAsDigits(String fileName)
    {
        List<Integer> digits = new ArrayList<Integer>();
        List<String> lines = readLines(fileName);

        if (lines.isEmpty()) {
            return digits;
        }

        String firstLine = lines.get(0).trim();
        for (char c : firstLine.toCharArray())
        {
            if (Character.isDigit(c)) {
                digits.add(c - '0');
            }
        }

        return digits;
    }
}
