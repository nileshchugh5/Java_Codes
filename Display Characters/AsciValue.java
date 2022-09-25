import java.util.*;
import java.util.Scanner;
class AsciValue{
 public static void main (String[] args) 
 {
    Scanner in = new Scanner(System.in);
    int n=4;
    int[] num = new int[n];
    System.out.print("Enter the digits:");
     for(int i=0;i<4;i++)
      num[i] =in.nextInt();
      
     for(int i=0;i<4;i++)
      System.out.print("\n"+num[i]+"-"+(char)num[i]);
 }
}