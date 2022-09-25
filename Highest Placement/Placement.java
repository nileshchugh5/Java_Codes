//Handson-1 (Highest Placement)


import java.util.*;
import java.util.Scanner;

public class Placement{
    public static void main(String avrg[]){
        int Cse,Mech,Ece;
        try {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the no of students placed in CSE:");
        Cse =in.nextInt();
        System.out.print("\nEnter the no of students placed in ECE:");
        Ece =in.nextInt();
        System.out.print("\nEnter the no of students placed in MECH:");
        Mech =in.nextInt();
        in.close();
        }
        catch(Exception e ){
        return;
        }
        if (Cse<0||Ece<0||Mech<0)
        {
            System.out.print("\nInput is Invalid");
            return ;
        }
        if(Cse == Ece && Ece == Mech){
            System.out.print("\nNone of the department has got the highest placement ");
            return ;
        }
        else if(Cse ==Ece && Cse>Mech)
        {
            System.out.print("\nHighest placement \nCSE\nECE ");
        }
        else if(Mech ==Cse && Cse>Ece)
        {
            System.out.print("\nHighest placement \nCSE\nMECH");
        }
        else if(Mech ==Ece && Ece>Cse)
        {
            System.out.print("\nHighest placement \nECE\nMECH ");
        }
         else if(Cse>Ece && Cse > Mech)
        {
            System.out.print("\nHighest placement\nCSE ");
        }
        else if(Ece > Mech)
        {
            System.out.print("\nHighest placement\nECE ");
        }
        else
        {
            System.out.print("\nHighest placement\nMECH ");
        }
        
    }     
}