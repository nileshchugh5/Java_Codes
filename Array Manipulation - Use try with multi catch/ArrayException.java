import java.util.*;
import java.util.InputMismatchException;
 public class ArrayException
 {
     public static void main (String[] args) {
        
        System.out.println(new ArrayException().getPriceDetails());
     }
     
     
     
     public String getPriceDetails()
     {
         int i ;
         Scanner f =new Scanner(System.in);
         System.out.println("Enter the number of element in the array");
         int n = f.nextInt();
         int ar[]= new  int[n];
         
             System.out.println("Enter the price details");
            
             for (i=0;i<n ;++i ){
             try
             {
                 ar[i]=f.nextInt();
             }
         catch(InputMismatchException ignore)
         {
             return "Input was not in the correct format";
         }
         
    }   
    System.out.println("Enter the Index of the array element you want to access");
     
     try {
         int index = f.nextInt();
         return "The array element is "+ar[index];
     }
     catch(InputMismatchException ignore)
         {
             return "Input was not in the correct format";
         }
         catch(ArrayIndexOutOfBoundsException ignore)
         {
             return "Array index is out of range";
         }
       
 
     }
 }