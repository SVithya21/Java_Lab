import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileReadWrite 
{
    public static void main(String[] args) 
    {
        String fileName = "Demo.txt";
        try 
        {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, this is a file handling example in Java.\n");
            writer.close();
            System.out.println("Data successfully written to the file.");
        } 
        catch (IOException e) 
        {
            System.out.println("Error while writing to the file: " + e.getMessage());
        }
        try 
        {
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            System.out.println("\nReading from the file:");
            while ((line = bufferedReader.readLine()) != null) 
            {
                System.out.println(line);
            }
            bufferedReader.close();
        } 
        catch (IOException e) 
        {
            System.out.println("Error while reading from the file: " + e.getMessage());
        }
    }
}