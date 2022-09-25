import java.util.*;
import java.util.Scanner;

class Authority{
     public static void main (String[] args) {
        String s;
        Scanner in = new Scanner(System.in);
        System.out.println("Inmate's name:");
        String name = in.nextLine();
        System.out.println("Inmate's father's name:");
        String father = in.nextLine();
        s=name.concat(" ").concat(father);
        if(name.matches("[A-Za-z\\s]+") && father.matches("[A-Za-z\\s]+"))
         System.out.println(s.toUpperCase());
         
         else if(!name.matches("[A-Za-z\\s]+"))
         System.out.println("Invalid name");
         
           else if(!father.matches("[A-Za-z\\s]+"))
         System.out.println("Invalid name");
    }
}