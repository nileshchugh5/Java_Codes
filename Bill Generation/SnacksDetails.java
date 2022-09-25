import java.util.*;
import java.util.Scanner;
public class SnacksDetails{
	public static void main(String arg[])
	{	int pizza,puff,cd;
        int total;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no of pizzas bought:");
         pizza= in.nextInt();
        System.out.print("\nEnter the no of puffs bought:");
         puff= in.nextInt();
        System.out.print("\nEnter the no of cool drinks bought:");
         cd= in.nextInt();
         System.out.println("Bill Details");
         System.out.println("No of pizzas:"+pizza);
         System.out.println("No of puffs:"+puff);
         System.out.println("No of cooldrinks:"+cd);
         total =(100*pizza)+(puff*20)+(cd*10);
         System.out.println("Total price="+total+"\nENJOY THE SHOW!!!");

    }
    
}