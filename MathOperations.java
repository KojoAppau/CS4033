/**************************************************************************
 * Creates a method for perfoming math operations on two numbers
 *        
 *
 * @author Elijah Kojo Danso Appau
 * @version September 16th, 2023
*************************************************************************/
public class MathOperations
{

      /******************************************************************************
    *   Method: add:   Adds two numbers togethor
    *
    *   Input:     Double 
    *   Output:    Double
    *   
    ******************************************************************************/ 
     public static double add(double a, double  b)
     {
         
         System.out.println("The result of the addition is => "); 
         return a + b; 
           
     }

     
     
       /******************************************************************************
    *   Method: subtract:  Subtracts two numbers 
    *
    *   Input:     Double 
    *   Output:    Double
    *   
    ******************************************************************************/ 

     
     public static double subtract(double a, double b)
     {
        System.out.println("The result of the subtraction is => ");
        return  a - b;
     }
     
     
     
     
        /******************************************************************************
    *   Method: multiply:  Multiplies two numbers 
    *
    *   Input:     Double 
    *   Output:    Double
    *   
    ******************************************************************************/ 

     
     public  static double multiply(double a, double b)
     {
          System.out.println("The result of the subtraction is => ");
        return  a*b;
     }
     
      
      
      
      
        /******************************************************************************
    *   Method: divide: Divide two numbers 
    *
    *   Input:     Double 
    *   Output:    Double
    *   
    ******************************************************************************/ 
 
     public static double divide(double a , double b)
     {
          System.out.println("The result of the division is => ");
        return  a/b;

     }

}