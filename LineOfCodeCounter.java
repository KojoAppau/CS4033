import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineOfCodeCounter 
{
    public static void main(String[] args) 
    {
        // Replace with the path to your .java file
        String filePath ="/Users/elijahappau/Desktop/UNB/CS4033/OperationDriver.java" ;
        
        int semicolonCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) 
        {
            String line;
            while ((line = br.readLine()) != null) {
                // Count semicolons in the line
                semicolonCount += countSemicolons(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Total lines of code in the file: " + semicolonCount);
    }

    // Helper method to count semicolons in a line
    private static int countSemicolons(String line) 
    {
        int count = 0;
        for (char c : line.toCharArray()) 
        {
            if (c == ';') 
            {
                count++;
            }
        }
        return count;
    }
}
