import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineOfCodeModified 
{
    public static void main(String[] args) 
    {
        /*****************************************
          Replace with the path to your .java file
          *****************************************/
          
        String filePath = "/Users/elijahappau/Desktop/UNB/CS4033/MathOperations.java";
       // String filePath = "/Users/elijahappau/Desktop/UNB/CS4033/OperationDriver.java";//

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) 
        {
            StringBuilder methodContent = new StringBuilder();
            boolean insideMethod = false;
            String methodName = null;
            String line;

            while ((line = br.readLine()) != null) 
            {
                line = line.trim();
                if (line.startsWith("public") || line.startsWith("protected") || line.startsWith("private"))
                 {
                    // Start of a method
                    insideMethod = true;
                    methodContent.setLength(0); // Reset the method content
                    methodName = extractMethodName(line);
                }

                if (insideMethod)
                 {
                    methodContent.append(line).append("\n");

                    if (line.contains("}"))
                     {
                        // End of a method
                        insideMethod = false;
                        countSemicolonsInMethod(methodName, methodContent.toString());
                    }
                }
            }
        } catch (IOException e) 
        {
            e.printStackTrace();
        }
    }

    
    /**************************************
     Method to count semicolons in a method
     **************************************/
     
    private static void countSemicolonsInMethod(String methodName, String methodContent) 
    {
        int semicolonCount = 0;
        for (char c : methodContent.toCharArray())
         {
            if (c == ';') 
            {
                semicolonCount++;
            }
        }
        System.out.println("Method Name: " + methodName);
        System.out.println("Lines of Code: " + semicolonCount);
        System.out.println();
    }

    /***************************************************
     Method to extract method name from method signature
     ***************************************************/

        private static String extractMethodName(String methodSignature)
     {
        String[] parts = methodSignature.split("\\s+");
        if (parts.length >= 4) {
            return parts[3].split("\\(")[0];
        }
        return "";
    }
}
